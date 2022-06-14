package com.theplayer.kits;

public class Reference {
	public static void main(String[] agrs) {
		//TODO: point to addrees(ID)
//		Reference inst = new Reference(); // <-- constructor
		// return object' id(address)
		// inst: reference variable
		//     : name of instance
//		System.out.println(inst);  // .toString();
//		System.out.println(inst.hashCode());
//		System.out.println(inst.getClass().getName());
		
		Reference inst1 = new Reference();
		Reference inst2 = new Reference();
		System.out.println(inst1 + " vs " + inst2);
	}
	    
}
