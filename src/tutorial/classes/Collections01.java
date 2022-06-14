package tutorial.classes;

import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Collections01 {
	public static void main(String[] args) {
		// Set list - Map is Key: Value
		//element : index(int) va name(String)
		Set<String> set1 = new HashSet<String>();
		List<String> list1 = new ArrayList<String>(); // cho luu tat 
		LinkedList<String> list2 = new LinkedList<String>();
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		set1.add("first1");
		set1.add("first2");
		System.out.println(set1.size());
		
		
		list1.add("first1");
		list1.add("first2");
		System.out.println(list1.size());
		
		map1.put("first1", 10);
		map1.put("first2", 10);
		System.out.println(map1.size());
		System.out.println(map1.keySet());
	}
	
	
	
	
	
	public static void main3(String[] args) {
		Dao<String> inst = new ArrayDao();
//		inst.create(Integer.valueOf(100));
		//collection framework
		List list = new ArrayList<String>();
	}
	
	
	
	public static void main2(String[] args) {
		Simsim sime = new Simsim();
		sime.bye(Integer.valueOf(100));
		sime.bye(new String("jame"));
	}
	
	
	
	public static void main1(String[] args) {
		//client use instance of Simsim
		Simsim sime = new Simsim();
		sime.hello("/members/list");
		//client decide type
		sime.say(new Integer(100));
		sime.say(new Double(10.0));
		sime.say(new String("10.0"));
	}
}
