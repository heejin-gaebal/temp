package main;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		
		System.out.println("========== Heejin Tour ==========");
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		cnt++;	//첫번째 질문
		System.out.println("Q" + cnt +"." + "이름을 입력해주세요");
		String userName;
		userName = sc.next();
		
		cnt++;	//두번째 질문
		System.out.println(userName + "님의 여행지를 추천드릴께요!\n" + "Q" + cnt +"." +  "선택지를 골라주세요!" );
		
		while(true) {
			System.out.println("1.휴양지 2.관광지" );
			int x = sc.nextInt();
			if(x == 1) {
				cnt++;	//세번째 질문
				System.out.println("휴양지를 선택하셨네요!" );
				System.out.println("Q" + cnt +"." + "가고싶은 나라를 골라주세요!\n1.일본 2.태국 3.미국 4.이탈리아");
				
				while(true) {
					cnt++;	//네번째 질문
					int y = sc.nextInt();
					if(y == 1) {
						System.out.println("Q" + cnt +"." + "일본의 추천 휴양지에요!! 1.삿포로 2.유후인");
						
						while(true) {
							int jcity = sc.nextInt();
						
							if(jcity==1) {
								System.out.println("일본의 삿포로로 떠나요~");
							}else if(jcity==2){
								System.out.println("일본의 유후인으로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else if(y == 2) {
						System.out.println("Q" + cnt +"." + "태국의 추천 휴양지에요!! 1.푸켓 2.치앙마이");
						
						while(true) {
							int tcity = sc.nextInt();

							if(tcity==1) {
								System.out.println("태국의 푸켓으로 떠나요~");
							}else if(tcity==2){
								System.out.println("태국의 치앙마이로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else if(y == 3){
						System.out.println("Q" + cnt +"." + "미국의 추천 휴양지에요!! 1.마이애미 2.LA");
						
						while(true) {
							int ucity = sc.nextInt();
							
							if(ucity==1) {
								System.out.println("미국의 마이애미로 떠나요~");
							}else if(ucity==2){
								System.out.println("미국의 LA로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else if(y == 4){
						System.out.println("Q" + cnt +"." + "이탈리아의 추천 휴양지에요!! 1.아말피 2.소렌토");
						
						while(true) {
							int icity = sc.nextInt();
							
							if(icity==1) {
								System.out.println("이탈리아의 아말피로 떠나요~");
							}else if(icity==2){
								System.out.println("이탈리아의 소렌토로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else {
						System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
						continue;
					}
					break;
				}
			}else if(x == 2) {
				System.out.println("관광지를 선택하셨습니다.");
				// 두번째 질문
				System.out.println("Q" + cnt +"." + "가고싶은 나라를 골라주세요!\n1.일본 2.태국 3.미국 4.이탈리아");
				
				while(true) {
					int y = sc.nextInt();
					cnt++;
					if(y == 1) {
						System.out.println("Q" + cnt +"." + "일본의 추천 관광지에요!! 1.도쿄 2.오사카");
						
						while(true) {
							int jcity = sc.nextInt();
						
							if(jcity==1) {
								System.out.println("일본의 도쿄로 떠나요~");
							}else if(jcity==2){
								System.out.println("일본의 오사카로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else if(y == 2) {
						System.out.println("Q" + cnt +"." + "태국의 추천 관광지에요!! 1.방콕 2.파타야");
						
						while(true) {
							int tcity = sc.nextInt();

							if(tcity==1) {
								System.out.println("태국의 방콕으로 떠나요~");
							}else if(tcity==2){
								System.out.println("태국의 파타야로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else if(y == 3){
						System.out.println("미국의 추천 관광지에요!! 1.시애틀 2.라스베가스");
						
						while(true) {
							int ucity = sc.nextInt();
							
							if(ucity==1) {
								System.out.println("미국의 시애틀로 떠나요~");
							}else if(ucity==2){
								System.out.println("미국의 라스베가스로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else if(y == 4){
						System.out.println("이탈리아의 추천 관광지에요!! 1.밀라노 2.피렌체");
						
						while(true) {
							int icity = sc.nextInt();
							
							if(icity==1) {
								System.out.println("이탈리아의 밀라노로 떠나요~");
							}else if(icity==2){
								System.out.println("이탈리아의 피렌체로 떠나요~");
							}else {
								System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
								continue;
							}
							break;
						}
					}else {
						System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
						continue;
					}
					break;
				}
			}else {
				System.out.println("잘못 선택하셨습니다 ㅠㅇㅠ 다시 골라주세요");
				continue;
			}
			break;
		}
		System.out.println("");
		System.out.println("*****별만들기*****");
		
		for(int i = 0; i < 5; i++) {   
			for(int j = 0; j<=i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		System.out.println("*****거꾸로*****");
		
		for(int a = 5; a>0; a--) {
			for(int b = 0; b<a; b++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}