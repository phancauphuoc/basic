package com.theplayer.kits.oop;

public class SacticMember {
//member
	static int value;  //field == variable
	static MemberVO vo;
	//static == class member           // non-static == instance
	static {
		vo = new MemberVO();
	}
	public SacticMember() { //contructor
		
		
		//System.out.println(vo + " in constructor");
		
		
	}
	 void todo() {//method is function
		vo = new MemberVO();
		value = 100;// instance field
	}
}
