package com.stoica.medicateproject.domain.exception;

public class CpfAlreadyExistsException extends BusinessRuleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String MESSAGE_CPF_ALREADY_EXISTS = "CPF: '%s' Already registered.";

	public CpfAlreadyExistsException(String message) {
        super(String.format(MESSAGE_CPF_ALREADY_EXISTS, message)); 
    }
	
}
