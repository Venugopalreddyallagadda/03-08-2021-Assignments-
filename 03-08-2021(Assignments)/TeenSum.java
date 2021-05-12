package com.ojas.mar06;

import java.util.Scanner;

public class TeenSum {
	static int fixTeen(int num) {
        if(num <= 12 || num == 15 || num == 16)
            return num;
        else
            return 0;
    }
    
    static int noTeenSum(int num1,int num2,int num3) {
        int sum = 0;
        
        sum += fixTeen(num1);
        sum += fixTeen(num2);
        sum += fixTeen(num3);
        
        return sum;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(noTeenSum(num1,num2,num3));

	}

}
