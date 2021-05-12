package com.ojas.mar06;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Integer.parseInt("" + str.charAt(i));
			}

		}
		System.out.println(sum);
	}
}
