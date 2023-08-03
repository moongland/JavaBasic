package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz_v2 {
	
	public static void main(String[] args) {
		
		//--- 상수 선언 ---
		final int FLOOR = 7; //건물의 층 수
		final int COST = 12000; //인당 관리비
		
		
		//--- 필요한 변수 선언 ---
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("관리할 건물의 층수는? ");
//		int FLOOR = sc.nextInt();
//		
//		System.out.print("인당 관리비는? ");
//		int COST = sc.nextInt();

		
		//각 층 인원 + 총 인원 배열
		int[] people = new int[FLOOR+1];	//arr
		
		//각 층 관리비 + 총 관리비 배열
		int[] fee = new int[FLOOR+1];		//arr2
		
		
		
		//--- 각 층의 인원 입력 --- (나중에 Scanner 입력으로 바꿔야 함)
//		people[0] = 67; //1층 인원
//		people[1] = 4; //2층 인원
//		people[2] = 70; //3층 인원
//		people[3] = 9; //4층 인원
//		people[4] = 55; //5층 인원

		//총 인원 계산
//		people[5] = people[0] + people[1] + people[2] + people[3] + people[4];
		
		System.out.println("- - - 각 층의 인원 입력 - - -");
		for(int i=0; i<FLOOR; i++) {
			System.out.print(" >> " + (i+1) + "층의 인원은? ");
			people[i] = sc.nextInt(); //각 층 인원

			//총 인원 계산
			people[FLOOR] += people[i];
		}
		
		
		
		//--- 관리비 계산 ---
		for(int i=0; i<FLOOR+1; i++) {
//			fee[i] = people[i] * 12000;
			fee[i] = people[i] * COST;
		}
		
		
		//--- TEST ---
//		for(int i=0; i<people.length; i++) {
//			System.out.println("TEST 인원] " + i + " >> " + people[i]);
//		}
//		
//		for(int i=0; i<fee.length; i++) {
//			System.out.println("TEST 관리비] " + i + " >> " + fee[i]);
//		}
		
		
		
		//--- 전체 출력 ---
		System.out.println();
		System.out.println("- - - 각 층의 관리비 - - -");
		for(int i=0; i<FLOOR; i++) {
			System.out.println(" >> " + (i+1) + "층의 관리비는 " + fee[i] + "원 입니다");
		}
		
		System.out.println();
		System.out.println("총 인원은 " + people[FLOOR] + "명 입니다");
		System.out.println("총 관리비는 " + fee[FLOOR] + "원 입니다");
		
	}
	
}

















