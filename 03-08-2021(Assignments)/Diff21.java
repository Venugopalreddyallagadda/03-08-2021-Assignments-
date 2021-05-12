package com.ojas.mar06;

import java.util.Scanner;

public class Diff21 {
	static void differenceTwentyOne(int n) {
	int res =0;
	int num1 = 21;
	 res = num1-n;
	 System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		differenceTwentyOne(n);

	}

}
