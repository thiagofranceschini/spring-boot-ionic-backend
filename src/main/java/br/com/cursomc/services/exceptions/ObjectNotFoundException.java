package br.com.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String messageException) {
		super(messageException);
	}
	
	public ObjectNotFoundException(String messageException, Throwable cause) {
		super(messageException, cause);
	}

}
