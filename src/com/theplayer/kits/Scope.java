package com.theplayer.kits;







public class Scope {
//	private int InstVar;// field by name
//	private static int classVar;
	int total = 0;
	
	public static void main(String[] args) {// class method
		//range to use
	//	fnum = 10;
//		Scope obj1 = new Scope(); // instance
//		Scope obj2 = new Scope(); //instance
//		Scope.classVar = 10;
//		System.out.println(obj1.classVar);
//		System.out.println(obj2.classVar);
//		obj1.InstVar = 100;
//		System.out.println(obj1.InstVar);
//		System.out.println(obj2.InstVar);
//		obj1.InstVar = 200;
//		System.out.println(obj1.InstVar);
//		System.out.println(obj2.InstVar);
		
		Scope obj = new Scope();
		obj.sum(10, 20);
		//System.out.println(total);
	}

	public void sum(int a, int b) {
	// TODO Auto-generated method stub
		total = a+b;
	}
	
	

}
