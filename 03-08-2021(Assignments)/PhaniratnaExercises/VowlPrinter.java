package com.ojas.mar06;

import java.util.Scanner;

public class VowlPrinter {

	static String filterConsonants(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.toUpperCase().charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				res = res + c;
			}
			if (str == "") {
				System.out.println("null");
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println(filterConsonants(str));
	}

}
