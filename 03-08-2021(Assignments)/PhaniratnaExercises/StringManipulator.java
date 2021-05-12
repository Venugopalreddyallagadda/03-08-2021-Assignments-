package com.ojas.mar06;

import java.util.Scanner;

public class StringManipulator {
	static String removeVowels(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {

			if (!("AEIOU".contains("" + str.toUpperCase().charAt(i)))) {
				res = res + str.charAt(i);
			}
			if (res == "") {
				return null;
			}

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(removeVowels(str));
	}

}
