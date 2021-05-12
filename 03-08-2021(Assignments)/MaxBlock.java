package com.ojas.mar06;

import java.util.Scanner;

public class MaxBlock {
	static int maxBlock(String str) {
	      int sum = 0;
	        int count = 1;
	        char prev_ch = '\0'; 
	        for(int i = 0; i < str.length(); i++) {
	            char curr_ch = str.charAt(i);
	            if(curr_ch == prev_ch) {
	                count++;
	            }
	            else {
	                if(sum < count) {
	                    sum = count;
	                }
	                count = 1;
	            }
	            prev_ch = curr_ch;
	        }
	        return sum;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        System.out.println(maxBlock(str));
       
	}

}
