package main;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import main.dao.BlogMemoryDao;
import main.service.Blogservice;

/**
 * this class is sample
 * 
 * @author phuoc
 * @email phancauphuoc@gmail.com
 * 
 * 
 * */

public class App2 {
	public static void main(String[] args) {
		// call static method
		//new Blogservice();
		//dependency injection
		App2.run(new Blogservice(new BlogMemoryDao() ));
	}
	
	public static void run(Blogservice service) {
		Scanner sc = new Scanner(System.in);
		String cmd;
		do {
			System.out.println("cmd >");
			cmd = sc.nextLine();
			Map<String, String> map =  service.process(cmd);
			Set<String> keys = map.keySet();
			
			//enhanced for
//			for(String key : keys) {
//				System.out.println(key + " : " + map.get(key));
//			}
//			
		}while(!"exit".equalsIgnoreCase(cmd));
		System.out.println("terminated");
		sc.close();
	}
}
