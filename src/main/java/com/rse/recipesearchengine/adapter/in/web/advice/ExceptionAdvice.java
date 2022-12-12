package com.rse.recipesearchengine.adapter.in.web.advice;

import com.rse.recipesearchengine.adapter.in.web.data.response.ResponseMessage;
import com.rse.recipesearchengine.application.exception.DocumentContentNotFoundException;
import com.rse.recipesearchengine.application.exception.DocumentNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
																  HttpHeaders headers,
																  HttpStatusCode status,
																  WebRequest request) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage("Invalid request content"));
	}


	@ExceptionHandler(IOException.class)
	public ResponseEntity<ResponseMessage> handleIO(IOException ex) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseMessage("Error loading file"));
	}

	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ResponseEntity<ResponseMessage> handleMaxUploadSize(MaxUploadSizeExceededException ex) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage("File too large"));
	}

	@ExceptionHandler(DocumentNotFoundException.class)
	public ResponseEntity<ResponseMessage> handleDocumentNotFound(DocumentNotFoundException ex) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseMessage("Document Not Found"));
	}

	@ExceptionHandler(DocumentContentNotFoundException.class)
	public ResponseEntity<ResponseMessage> handleDocumentContentNotFound(DocumentContentNotFoundException ex) {
		ex.printStackTrace();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseMessage("Could not read document content"));
	}

}
