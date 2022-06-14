package com.theplayer.kits;

public class Controls {
	public static void main(String[] args) {
		// loop for
		for(int i = 0; i < 10; i++) {
			System.out.println("for");
		}
		// loop while
		int k = 0;
		while(k < 10) {
			System.out.println("while");
			k++;
		}
		//loop do while
		int m = 0;
		do {
			System.out.println("do-while");
			m++;
		}while(m < 10);
		
	}
	
	
	
	
	public static void switchmt(String[] args) {
//		if(true) {
//			break; // switch, loop
//		}
		
		int value = 11;
		switch(value){
//		case 1+10:
//		case a:
		case 1:
			System.out.println("value is 1");
			break;
		case 3:
			System.out.println("value is 3");
			break;
		case 7:
			System.out.println("value is 7");
			break;
		case 10:
			System.out.println("value is 10");
			break;
		default:
			System.out.println("value is null");
		}
	}
	
	public static void ifsmt(String[] args) {
		
		boolean expression = true;
		if(expression) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
		if(expression) {
			if(expression) {
				System.out.println("TRUE");
			}else {
				System.out.println("FALSE");
			}
		}
		
	}
}
