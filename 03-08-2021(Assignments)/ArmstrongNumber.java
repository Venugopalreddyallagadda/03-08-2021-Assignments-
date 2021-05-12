package com.ojas.mar06;

import java.util.Scanner;

public class ArmstrongNumber {
	static int armstrongNumber(int num) {
		String res = "";
		int temp = num, rem = 0, sum = 0;
		while (num > 0) {
			
			rem = num % 10;
			num = num / 10;
			sum = sum + (rem * rem * rem);
		}
		if (temp == sum) {
			System.out.println("given num armstrong");
		} else {
			System.out.println("given num not armstrong");

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("check armstrong number:"+armstrongNumber(num));

	}

}
