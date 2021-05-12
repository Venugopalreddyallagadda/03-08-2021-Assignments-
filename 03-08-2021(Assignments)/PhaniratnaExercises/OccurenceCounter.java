package com.ojas.mar06;

import java.util.Scanner;

public class OccurenceCounter {
	static int getCount(int[] arr, int number) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the searching number...");
		int number = sc.nextInt();
		if (number > 0) {
			System.out.println(getCount(arr, number));
		} else {
			System.out.println("-1");

		}

	}
}