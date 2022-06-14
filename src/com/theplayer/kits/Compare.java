package com.theplayer.kits;

import java.util.Random;

public class Compare {
	public static void main(String[] agrs) {
		//offset
//		System.out.println(10 + 5);
//		System.out.println(10 - 5);
//		// goup
//		System.out.println(10 * 5);
//		System.out.println(10 / 5);
//		// limited
//		System.out.println(10 % 5);
//		
//		int a = 5;
//		int b = ++a;
//		int c = a++;
		
		//random
		int a = (int) (Math.random()*10000);
		//System.out.println(a);
		
		// 3 digital , integer
		int min = 100;
		int max = 999;
//		Random random = new Random();
//		random.nextInt();
		int number  = (int)(Math.random()*100000);
		number = number % (max +1 - min); // ~(max - min)
		number = number + min;
		System.out.println(number);
	}
	
	public static void logic() {
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println( !false);
	}
	
	public static void compare(){
		// value va value return : boolean
		System.out.println(1 < 10);
		System.out.println(1 > 10);
		System.out.println(1 <= 10);
		System.out.println(1 >= 10);
		System.out.println(1 == 10);
		System.out.println(1 != 10);
	}
}
