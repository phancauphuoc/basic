package com.theplayer.kits.vo;

//public ==> pakage khac chung dc
//default ==> trong pakage do thoi
//protected : family ==> 
//private ==> field


//lombok, @Getter
public class LoginUser {
	private String userID;
	private String userPw;
	 
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	public static void todo() {
		
	}
}
