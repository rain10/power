package org.arain.power.common.exception;
/**
 * 
* <p>Title:UseException </p>
* @author Arain
* @date2017年8月29日
 */
@SuppressWarnings("serial")
public class UseException extends ArainException{
	public UseException(String message, Throwable cause) {
		super(message, cause);
	}

	public UseException(int code,String message) {
		super(code,message);
	}
	
	public UseException(String message) {
		super(message);
	}

	public UseException(Throwable cause) {
		super(cause);
	}
}
