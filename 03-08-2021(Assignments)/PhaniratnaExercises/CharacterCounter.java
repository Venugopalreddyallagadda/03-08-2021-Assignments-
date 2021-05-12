package com.ojas.mar06;

import java.util.Scanner;

public class CharacterCounter {
	static int charCounter(String input, char toFind) {
		String str = input.toUpperCase();
		int count = 0;
		if (input == "") {
			return -1;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == toFind) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println(charCounter("Hello world", 'l'));

	}

}
