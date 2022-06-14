package tutorial.classes;

public class Main {
//	public static void main(String[] args) {
//		String name1 = "James";
//		String name2= "James";
//		name1 += "2";
//		
//		System.out.println(name1.hashCode());
//		System.out.println(name2.hashCode());
//	}
//	
//	
	
	public static void main(String[] args) {
//		String dummy = null;
//		System.out.println(dummy.toString()); // loi khong duoc xuat hien
//		
		
		String s1 = "jame";
		String s2 = "james";
		System.out.println(s1 + ":" + s1.hashCode());
		System.out.println(s2 + ":" + s2.hashCode());
		s2+="s";
		s1+="ss";
		byte[] ar1 = s1.getBytes();
		System.out.println(ar1 + ":" + s1.hashCode()+s1);
		byte[] ar2 = s1.getBytes();
		System.out.println(ar2+ ":" + s2.hashCode()	+s2);
	}
	
}
