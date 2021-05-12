package com.ojas.logic01;

import java.util.Scanner;

public class AadhamNum {
	static int square(int num) {
		return num * num;
	}

	static int reverseofNum(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = 0;
			int temp;
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		return sum;
	}

	static boolean aadhamNum(int num) {
		int square = square(num);
		int rev = square(reverseofNum(num));
		if (square == reverseofNum(rev))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		if (aadhamNum(num)) 
	        System.out.println("Adam Number"); 
	        else
	        System.out.println("Not a Adam Number");  

	}

}
