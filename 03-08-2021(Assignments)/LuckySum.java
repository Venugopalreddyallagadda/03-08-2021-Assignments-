package com.ojas.mar06;

import java.util.Scanner;

public class LuckySum {
	static int luckySum(int num1, int num2, int num3) {
		int num = 0;
		if (num1 != 13 && num2 != 13 && num3 != 13) {
			num = num1 + num2 + num3;
			return num;
		} else if (num1 == 13) {
			return 0;
		} else if (num2 == 13) {
			return num1;
		} else if (num3 == 13) {
			return num1 + num2;
		} else {
			System.out.println("invalid");
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println("LuckySum:" + luckySum(num1, num2, num3));
	}

}
