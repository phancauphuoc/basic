package com.theplayer.kits;

import java.util.Scanner;

import com.theplayer.kits.vo.LoginUser;

public class Main {

	private static Scanner sc;
	private static LoginUser[] users;
	
	static {// initialize block before Constructor
		sc = new Scanner( System.in );
		users = new LoginUser[ 10 ];
	}	
	public static void main(String[] args) {
		int seq = 0;// 0 ~ 9
		boolean exit = false;
		do {
			System.out.println(" cmd > ");
			String cmd = sc.nextLine();
			if("exit".equals(cmd)) {    //==> kiem tra nhap co phai exit ko
//				cmd.equalsIgnoreCase("exit")
				exit = true;                    // gan lai bien neu nhap exit
			}
			if("join".equals(cmd)) {          // neu nhap join
				LoginUser user = join();      // khai bao doi tuong user cua ham join
				if( seq < users.length) {     // 0 < 10
					users[seq] = user;        // array users[0]
					seq++;                    // seq = 1
				}
			}
			if("login".equals(cmd)) {                      //neu nhap login      
				LoginUser user = login();				   //khoi tao user DL ham login
				if( user == null ) {					   
					System.out.println("failed");
				}else {
					System.out.println("success login");
					System.out.println(user.getUserID());
					System.out.println(user.getUserPw());
				}
			}
		}while( !exit);                      // thoat khoi vong lap KT CT
		
		sc.close();
	}

	private static LoginUser login() {
		LoginUser user = join();                                                     //lay du lieu id,pw cua join
		// search
		for(int i=0; i < users.length; i+=1) {                                       //chay tu 1 - 10
			if( users[i] != null ) {											     //neu users co DL
				if( users[i].getUserID().equals(user.getUserID()) ) {                //so sanh chuoi ham equals
					if( users[i].getUserPw().equals(user.getUserPw()) ) {
						return users[i];											 //tra ve DL cua user[i]
					}
				}
			}
		}
		return null;
	}
	// null means empty
	// but 0 means not empty, -1, 999
	// "없음" is string
	private static LoginUser join() {              //loginUser giong KDL , join la ten ham
		LoginUser user = new LoginUser();		   //khoi tao user
		System.out.println("ID : ");			   //
		String id = sc.nextLine(); 				   //nextLine -> lay ca khoang trong 
		System.out.println("PW : ");			   //
		String pw = sc.nextLine();
		
		user.setUserID(id);						   //gan lai du lieu goc
		user.setUserPw(pw);
		
		return user;								//tra ve ID, Pw
	}

}
