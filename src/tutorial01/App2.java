package tutorial01;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		// call static method
		App2.run();
	}
	
	public static void run() {
		Scanner sc = new Scanner(System.in);
		String cmd;
		do {
			System.out.println("cmd >");
			cmd = sc.nextLine();
		}while(!"exit".equalsIgnoreCase(cmd));
		System.out.println("terminated");
		sc.close();
	}
}
