package com.ojas.logic01;

import java.util.Scanner;

public class ValidMailId {
	static String isValidMailID(String mailId) {
		String res = "";
		if (mailId == null || mailId.isEmpty()) {
			return "";
		}

		if (!Character.isLowerCase(mailId.charAt(0))) {
			return "-1";
		}

		if (!mailId.contains("@")) {
			return "-2";
		}

		if (mailId.contains("@") && (mailId.indexOf("@") != mailId.lastIndexOf("@"))) {
			return "-3";
		}

		if (!(mailId.endsWith(".com") || mailId.endsWith(".co.in"))) {
			return "-4";
		}
		String regex = "^[A-Za-z0-9+_.]+@(.+)$";

		if (!mailId.matches(regex)) {
			return "-5";
		}

		return "Valid";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email");
		String mail = sc.next();
		System.out.println(isValidMailID(mail));
	}

}
