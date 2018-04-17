package org.arain.power.common.exception;
/**
 * 
* <p>Title:ArainException </p>
* @author Arain
* @date2017年8月29日
 */
@SuppressWarnings("serial")
public abstract class ArainException extends RuntimeException{
	private Integer code;

	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getCode() {
		return code;
	}
	
	public ArainException() {
	}

	public ArainException(String message, Throwable cause) {
		super(message, cause);
	}

	public ArainException(int code,String message) {
		super(message);
		this.code = code;
	}
	
	public ArainException(String message) {
		super(message);
	}

	public ArainException(Throwable cause) {
		super(cause);
	}
}
