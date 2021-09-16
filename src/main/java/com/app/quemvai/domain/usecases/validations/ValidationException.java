package com.app.quemvai.domain.usecases.validations;

public class ValidationException extends Throwable {

	public ValidationException(String message) {
		super(message);
	}
}