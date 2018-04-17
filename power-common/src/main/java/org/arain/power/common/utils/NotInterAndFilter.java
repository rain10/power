package org.arain.power.common.utils;

public class NotInterAndFilter {
	private static String[] paths = {"/login.do","/security","/swagger-resources","/api-docs","/ui"};
	
	public static boolean noCheck(String url) {
		String path = url.substring(url.lastIndexOf("/"), url.length());
		for (String string : paths) {
			if(string.equals(path)) {
				return true;
			}
		}
		return false;
	}
}
