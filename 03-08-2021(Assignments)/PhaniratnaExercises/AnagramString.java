package com.ojas.logic01;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	static boolean getAnagram(String str, String str1) {
		String result = "";
		String result2 = "";
		char c1[] = str.toCharArray();
		char c2[] = str1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		result += String.valueOf(c1);
		result2 += String.valueOf(c2);

		return result.equalsIgnoreCase(result2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Anagram String: ");
		String str = sc.next();
		String str1 = sc.next();
		System.out.println(getAnagram(str, str1));

	}

}
