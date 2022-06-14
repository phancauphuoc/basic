package com.theplayer.kits;

import java.io.IOException;
import java.util.Scanner;

public class StdInOut {
	public static void main(String[] agrs) throws IOException {
		// TODO: TRONG A CO B --> A.B
//		System.out.println("main calls print ");
//		System.out.print(190);// be string "190"
//		System.out.print("\n"+200); // \n cung xuong dong
//		System.out.println(); // syso + control space
		
//		int val = System.in.read(); // add security (ASCII VALUE)
//		System.out.println(val);
//		System.out.println((char)val);
//		val = System.in.read();
//		val = System.in.read();
//		val = System.in.read();
		
		Scanner sc = new Scanner(System.in);
		//sc.nextInt();
//		sc.nextDouble();
//		sc.nextLine(); // <- \n'
//		sc.close();
		String name = sc.nextLine();
		System.out.println("My name is:" + name);
	}
}
