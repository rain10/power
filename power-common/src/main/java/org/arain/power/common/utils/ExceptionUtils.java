package org.arain.power.common.utils;

public class ExceptionUtils {
	public static String catchBaseExceptionMsg(Throwable t) {
		String errorMsg = "系统错误!";
		if (t.getCause() == null) {
			if (t.getMessage() == null)
				return errorMsg;
			errorMsg = t.getMessage();
		} else {
			errorMsg = catchBaseExceptionMsg(t.getCause());
		}
		return errorMsg;
	}

}
