package com.rse.recipesearchengine.application.port.out;

public interface ExceptionEventPublisher {

	void publishException(Exception exception);

}
