package member.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== 회원가입 사이트 ======");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원님의 정보를 입력해주세요\n생일쿠폰도 전달드리니 생년월일도 알려주세요");
		System.out.println("회원 몇명의 정보를 입력하시나요?");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		Member[] m = new Member[n];
		
		for(int i = 0; i < n; i++) {
			m[i] = new Member();
			System.out.print("회원 이름 : ");
			m[i].name = sc.nextLine();
			System.out.print("회원 나이 : ");
			m[i].age = sc.nextInt();
			sc.nextLine();
			System.out.print("회원 생년월일 : ");
			m[i].birth = sc.nextLine();
		}
		for(int i=0; i < n; i++) {
			m[i].memberInfo();			
		}
		
	}

}
