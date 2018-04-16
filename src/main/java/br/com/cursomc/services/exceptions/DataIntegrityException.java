package br.com.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityException(String messageException) {
		super(messageException);
	}
	
	public DataIntegrityException(String messageException, Throwable cause) {
		super(messageException, cause);
	}

}
