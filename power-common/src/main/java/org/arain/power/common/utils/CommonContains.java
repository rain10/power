package org.arain.power.common.utils;

/**
 * 
* <p>Title:CommonContains </p>
* @author Arain
* @date2017年8月31日
 */
public class CommonContains {
	private static Short haveMenu_yes = 1;
	private static Short haveMenu_no = 0;
	private static String child_ajax="res_ajax";
	private static String child_button="res_button";
	private static Short userType_admin = 0;
	private static Short userType_user = 1;
	
	public static Short getUserType_admin() {
		return userType_admin;
	}
	public static Short getUserType_user() {
		return userType_user;
	}
	public static String getChild_ajax() {
		return child_ajax;
	}
	public static String getChild_button() {
		return child_button;
	}
	public static Short getHaveMenu_yes() {
		return haveMenu_yes;
	}
	public static Short getHaveMenu_no() {
		return haveMenu_no;
	}
	
}
