package com.stoica.medicateproject.domain.exception;

public class ClientNotFoundException extends BusinessRuleException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String CLIENT_NOT_FOUND = "Client not found.";
	
	public ClientNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public ClientNotFoundException(Long id) {
		this(""+id);
		// TODO Auto-generated constructor stub
	}

}
