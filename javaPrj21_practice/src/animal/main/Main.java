package animal.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("====== 동물n마리 정보 관리 ======");
		
		Scanner sc = new Scanner(System.in);
		//동물 정보 입력받기
		System.out.println("관리할 동물의 마리수를 적어주세요");
		int n = sc.nextInt();
		sc.nextLine();
		
		Animal[] a = new Animal[n];
		
		for(int i=0; i < n; i++) {
			a[i] = new Animal();
			System.out.print("동물 이름 : ");
			a[i].name = sc.nextLine();
			System.out.print("동물 나이 : ");
			a[i].age = sc.nextInt();
			sc.nextLine();
		}
		
		//동물 정보 출력하기
		for(int i=0; i < n; i++) {
			a[i].animalInfo();
		}
		
	}

}
