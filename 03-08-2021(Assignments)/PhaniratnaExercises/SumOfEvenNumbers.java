package com.ojas.logic01;

import java.util.Scanner;

public class SumOfEvenNumbers {
	static int getSumOfEvenNumbers(int num[]) {
		int res;
		int sum =0;
		for (int i = 0; i<num.length; i++) {
			if(num[i]%2==0) {
				res = num[i];
				sum = sum+res;
				
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements");
		int num[] = new int[5];
		for (int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(getSumOfEvenNumbers(num));

	}

}
