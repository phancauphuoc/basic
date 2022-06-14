package com.colammoicoan.kits;

import java.util.Scanner;

public class BookItem {
	private String name;
	private int quantity;
	private double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// input all params
	public void input() {
		// TODO Auto-generated method stub
		// thong bao nhap thong tin sach + Scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Book name :");
		String name = sc.nextLine();
		this.name = name;
		System.out.print("Book quantity :" );
		int quantity = sc.nextInt();
		this.quantity = quantity;
		System.out.print("Book price :" );
		double price = sc.nextDouble();
		this.price = price;
	}
	
	
}
