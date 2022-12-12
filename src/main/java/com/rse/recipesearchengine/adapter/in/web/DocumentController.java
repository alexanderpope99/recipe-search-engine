package com.rse.recipesearchengine.adapter.in.web;

import com.rse.recipesearchengine.adapter.in.web.data.response.FileInfo;
import com.rse.recipesearchengine.adapter.in.web.data.response.FileUploadResponse;
import com.rse.recipesearchengine.adapter.in.web.data.response.ResponseMessage;
import com.rse.recipesearchengine.application.exception.DocumentNotFoundException;
import com.rse.recipesearchengine.application.port.in.DocumentUseCase;
import com.rse.recipesearchengine.common.WebAdapter;
import com.rse.recipesearchengine.domain.Document;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import java.util.List;

@WebAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/documents")
public class DocumentController {

	private final DocumentUseCase documentUseCase;

	@PostMapping("/upload")
	public ResponseEntity<FileUploadResponse> uploadFile(@RequestParam("file") MultipartFile file) {
		String message = "";
		try {

			Document document = documentUseCase.save(file);

			message = "Uploaded the file successfully";

			String url = MvcUriComponentsBuilder
					.fromMethodName(DocumentController.class, "getFile",
							document.getName()).build().toString();

			return ResponseEntity.status(HttpStatus.OK).body(
					new FileUploadResponse(message, document.getName(), url)
			);
		} catch (Exception e) {
			message = "Could not upload the file";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(
					new FileUploadResponse(message, file.getOriginalFilename(), null)
			);
		}
	}

	@GetMapping
	public ResponseEntity<List<FileInfo>> getListFiles() {
		List<FileInfo> fileInfoList = documentUseCase.loadAll().stream().map(doc -> {
			String url = MvcUriComponentsBuilder
					.fromMethodName(DocumentController.class, "getFile",
							doc.getName().toString()).build().toString();

			return new FileInfo(doc.getName(), doc.getCreated(), doc.getModified(), url);
		}).toList();

		return ResponseEntity.status(HttpStatus.OK).body(fileInfoList);
	}

	@GetMapping("/{name}")
	@ResponseBody
	public ResponseEntity<Resource> getFile(@PathVariable String name) {
		Resource file = documentUseCase.load(name);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION,
						"attachment; filename=\"" + file.getFilename() + "\"").body(file);
	}

	@PatchMapping("/{name}")
	@ResponseBody
	public ResponseEntity<ResponseMessage> appendFile(@PathVariable String name,
													  @RequestParam("file") MultipartFile file) {
		documentUseCase.appendContent(name, file);
		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Append successful"));
	}
}
