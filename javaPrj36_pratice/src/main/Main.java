package main;

import member.MemberManager;

public class Main {

	public static void main(String[] args) {
		System.out.println("====== MEMBER ======");
		
		MemberManager memberManager = new MemberManager();
		
		memberManager.menu();
	}

}
