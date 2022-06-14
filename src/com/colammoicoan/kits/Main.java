package com.colammoicoan.kits;

import java.util.Scanner;

import com.theplayer.kits.vo.LoginUser;

public class Main {
	private static Scanner sc;
	

	static {// initialize block before Constructor
		sc = new Scanner(System.in);
		
		
		
	}

	public static void main(String[] args) {
		
		boolean exit = false;

		ManageBookService service = new ManageBookServiceImpl();
		do {
			System.out.print(" cmd > ");
			String cmd = sc.nextLine();
			if ("exit".equals(cmd)) {

				exit = true;
			}
			if ("add".equals(cmd)) {
				
				BookItem b = new BookItem();
				
				b.input();
				service.add(b);
			}
			if ("list".equals(cmd)) {
				System.out.println("print list:");
				service.list();
			}
			if ("delete".equals(cmd)) {
				System.out.println("delete item");
				System.out.println("Item name >");
				String name = sc.nextLine();
				service.delete(name);
			}
//			if ("update".equals(cmd)) {
//
//			}
//			if ("search".equals(cmd)) {
//
//			}
//			if ("totalQuantity".equals(cmd)) {
//
//			}

		} while (!exit);

		sc.close();
	}

}
