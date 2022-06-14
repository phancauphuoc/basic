package tutorial.classes;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;

public class DoDate {
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		System.out.println(ld);
		System.out.println(lt);
		
		
//		Locale locale = Locale.getDefault();
//		System.out.println(locale);//.toString
//		System.out.println(locale.getCountry());
//		System.out.println(locale.getDisplayCountry());
//		if(locale.getCountry().equals("VN")) {
//			System.out.println("xin chao");
//		}
	}
	
	
	
	public static void main3(String[] args) {
		//1. import
		//2. class, interface
		//3. constructor has arguments
		//4. static method
		Instant instant = Instant.now();
		System.out.println(instant);
		instant.getNano();
	}
	
	
	
	public static void main2(String[] args) {
//		//singleton pattern
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
//		for(int i = 0; i <= 10; i ++) {
//			cal = Calendar.getInstance();
//			//System.out.println(Calendar.getInstance());
//			System.out.println(cal.hashCode()); 
//		}
	}
	
	
	
	
	public static void main1(String[] args) {
//		java.util.Date update  = new java.util.Date();
//		String str = update.toString();
//		System.out.println(str);
//		
//		long lt =  update.getTime();
//		System.out.println(lt);
//		System.out.println(update.getTime());
		
		
//		Date date =  Date.from(Instant.now());
//		System.out.println(date);
		//System.out.println(Date.from(Instant.now()));
		
//		Date date = new Date(System.currentTimeMillis()); // long or int int int
//		Date date = new Date((long)(52*365*24*3600));
//		Date.from();
//		System.out.println(date);
		
	}
}
