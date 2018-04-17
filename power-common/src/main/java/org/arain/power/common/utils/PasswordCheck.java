package org.arain.power.common.utils;

public class PasswordCheck {
	public static int checkPassword(String passwordStr) {
		String regexZ = "\\d*";
		String regexS = "[a-zA-Z]+";
		String regexT = "\\W+$";
		String regexZT = "\\D*";
		String regexST = "[\\d\\W]*";
		String regexZS = "\\w*";
		String regexZST = "[\\w\\W]*";

		if (passwordStr.matches(regexZ)) {
			return 0;
		}
		if (passwordStr.matches(regexS)) {
			return 0;
		}
		if (passwordStr.matches(regexT)) {
			return 0;
		}
		if (passwordStr.matches(regexZT)) {
			return 1;
		}
		if (passwordStr.matches(regexST)) {
			return 1;
		}
		if (passwordStr.matches(regexZS)) {
			return 1;
		}
		if (passwordStr.matches(regexZST)) {
			return 2;
		}
		return 0;

	}
}
