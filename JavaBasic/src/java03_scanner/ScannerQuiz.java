package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz {
	//학생 정보 관리 프로그램
	
	//	이름, 나이, 성별, 국어, 영어, 수학
	//	6가지 정보를 저장할 수 있는 변수를 만들고
	//	총점과 평균을 포함한 결과를 출력한다
	
//동작 예시)
	
//===== 입력 =====
//Input Name : Alice
//Input Age : 33
	
//Input Gender : F
	
//Input Korean : 100
//Input English : 99
//Input Mathematics : 97

//===== 출력 =====
//이름	나이	성별	국어	영어	수학	총점	평균
//Alice	33		F		100		99		97		296		98.666666667

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력 객체
		//--------------------------------------------------------
		
		//이름 입력
		String name;
		System.out.print("Input Name : ");
		name = sc.nextLine();
		
//		System.out.println("[TEST] name : " + name);

		
		//나이 입력
		System.out.print("Input Age : ");
		int age = sc.nextInt();
		
//		System.out.println("[TEST] age : " + age);
		
		
		//성별 입력
		System.out.print("Input Gender : ");
		
		//String 처리
//		sc.nextLine(); //버퍼 비우기
//		String gender = sc.nextLine();

		//char 처리
		sc.nextLine(); //버퍼 비우기
		char gender = sc.nextLine().charAt(0);
		
//		System.out.println("[TEST] gender : " + gender);
		
		
		//국어 입력
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
		
		//영어 입력
		System.out.print("Input English : ");
		int eng = sc.nextInt();
		
		//수학 입력
		System.out.print("Input Mathematics : ");
		int math = sc.nextInt();
	
//		System.out.println("[TEST] 점수 : " + kor + ", " + eng + ", " + math); 
		
		
		//총점 계산
		int sum = kor + eng + math;
		
		//평균 계산
		double avg = sum / (double)3;
		
//		System.out.println("[TEST] sum : " + sum);
//		System.out.println("[TEST] avg : " + avg);
		

		
		//전체 출력
		System.out.println();
		System.out.println();
		
		System.out.println("--- 출력 ---");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(sum + "\t");
		
//		System.out.println(avg);
		
//		String formatted = String.format("%.2f", avg);
//		System.out.println( formatted );
		
//		System.out.println( String.format("%.2f", avg) );

		System.out.printf("%.2f", avg);
		System.out.println();

		
		
		
		
		
		//-------------------------------------------------------------
//		double testAvg = 12345.678;	//테스트 데이터
		
//		String avgText = String.valueOf( testAvg );	// double값을 String으로 변환
		
//		int dotIndex = avgText.indexOf(".");	// "." 글자의 인덱스 알아내기
		
//		String subText = avgText.substring(0, dotIndex+3);	// 0인덱스부터 "."의 위치 다다음까지 잘라내기
		
//		System.out.println(subText);
		
	}
}





















