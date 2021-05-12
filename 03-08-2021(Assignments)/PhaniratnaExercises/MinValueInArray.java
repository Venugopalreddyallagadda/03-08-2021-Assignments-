package com.ojas.logic01;

public class MinValueInArray {
	static int getNearestMinValue(int num[]){
		int small = num[0];
		for (int i = 1; i<num.length;i++) {
			if(num[i]<small) {
				small = num[i];
			}
		}
		return small-1;
		
	}
	public static void main(String[] args) {
		int num[] = {4,5,7,8,3};
		System.out.println(getNearestMinValue(num));

	}

}
