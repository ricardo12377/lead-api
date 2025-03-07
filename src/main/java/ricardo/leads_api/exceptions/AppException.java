package ricardo.leads_api.exceptions;

import org.springframework.http.HttpStatus;

public abstract class AppException extends RuntimeException {
	private HttpStatus httpCode;
	
	public AppException(String message, HttpStatus statusCode) {
		super(message);
		this.httpCode = statusCode;
	}
	
	public HttpStatus getHttpCode() {
		return this.httpCode;
	}
	
	public void setStatusCode (HttpStatus statusCode) {
		this.httpCode = statusCode;
	}
}
