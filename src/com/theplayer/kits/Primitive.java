package com.theplayer.kits;
/* 
 * Dara type
 * 
 * */
public class Primitive {
	public static void main(String[] agrs) {
		//defaultTypes();
		conversion();
	}

	private static void conversion() {
		 long a = 0x123456789L;
		 
		 System.out.println(123);   // DECIMAL
		 System.out.println(0x123); // HEXA
		 System.out.println("--------");
		 System.out.println(Integer.toHexString(9));
		 System.out.println(Integer.toHexString(0x9));
		 
		 
		 
//		 long n1 = (long)100; // EP KIEU
//		 long n2 = 100L; // xac dinh kieu long
//		 char c = 'A'; // char
//		 int cn = 'A'; //65
		
	}

	private static void defaultTypes() {
		// TODO Primitive type
		boolean bool;// true false
		
		//integer
		byte ascii; // 1 byte : unsigned ~ 255
		short s; // 2 byte
		int i;// 4 byte  999999999
		long l;// 8 byte: nen sd trong PrimaryKey, ID
		char unicode; // UTF-16 2 byte : utf8mb4 in DB
		
		//floating number
		double lf; // 8 byte;
		float f; // 4 byte;
	}
}
