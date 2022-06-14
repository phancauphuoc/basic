package com.theplayer.kits;

public class Quiz {
	public static void main(String[] args) {
		//quiz01();
		//quiz02(2);
		//quiz03();
		quiz003();
	}
	
	private static void quiz01() {
		//TODO: 1 ~ 27 +1 int -> print
		// 5 cay / line
//		int min = 1;
//		int max = 27;
//		int number  = (int)(Math.random()*100000);
//		number = number % (max +1 -min);
//		number = number + min;
//		int m = 0;
//		do {
//			System.out.println(number);
//			m++;
//		}while(m < 5); 
		
		for(int i = 1; i < 28; i++) {
			System.out.print(i + " ");
			if(i % 5 == 0) {
				System.out.println(" ");
			}
		}
	}
	 
//	private static void quiz02(int t) {
//		
//			for(int i = 1; i < 10; i++) {
//				for(int j = 2; j<10; j++) {
//					
//					
//					
//					System.out.print(j + " X " + i + " = " + i*j + "\t" );
//				}
//				System.out.println();
//				
//				
//		}
//			
//	}
	
	private static void quiz02(int t) {
		int a = t;
		for(int i = 2; i <= 9; i+=a) {
			for(int j = 1; j <= 9; j++) {
				for(int k=i; a>0 && k<=9; k++, a--) {
					System.out.print(k + " x " + j + " = " + k*j + "\t");
				}
				System.out.println("");
				
				a = t;
			}
			System.out.println("");
		}
	}
	
	private static void quiz03() {
		//TODO : print numbers (5 cay over), 3 digiets
		// condition : dont be duplicated each place
		int min = 1;
		int max = 9;
		int a = 0;
		for(int i = 0; i<12;i++) {
			int number1 = (int )(Math.random()*10000);
			number1 = number1 % (max - min + 1);
			number1 = number1 + min;
			int number2 = (int )(Math.random()*10000);
			number2 = number2 % (max - min + 1);
			int number3 = (int )(Math.random()*10000);
			number3 = number3 % (max - min + 1);
				if(number1 != number2 && number1 != number3 && number2 != number3) {
					System.out.println(number1+""+number2+""+number3 + "\r");
					a++;
				}
				if(a == 5) break;
		}
		
	}
	
	private static void quiz003() {
		int digits = 3;
		int r = 0; // 0 ~ 9
		for(int i = 0; i < 8; i+=1) {
			int number = 0;
			for(int j = 0; j < digits; j++) {
				do {
					r = (int)(Math.random()*10);
				}while(isDuplicaterd(number,r));
				number = number * 10 + r;
			}
			System.out.println(number);
		}
	}

	private static boolean isDuplicaterd(int number, int r) {
		// TODO Auto-generated method stub
		while(number > 0) {
			if(number % 10 == r) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
}
