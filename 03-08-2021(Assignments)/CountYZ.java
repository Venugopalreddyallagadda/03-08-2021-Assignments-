package com.ojas.mar06;

import java.util.Scanner;

public class CountYZ {
	static int countYZ(String str) {
		int count = 0;
		for (String st : str.split(" "));
		if (str.endsWith("y") || str.endsWith("z") || str.endsWith("Y") || str.endsWith("Z")) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		System.out.println("countYZ words:" + countYZ(str));

	}

}
