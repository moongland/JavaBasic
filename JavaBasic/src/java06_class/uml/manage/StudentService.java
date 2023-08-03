package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {

	//학생 정보 객체
	private Student stu;
//	private Student stu = new Student();
	
	//키보드 입력 객체
	private Scanner input;
//	private Scanner input = new Scanner(System.in);
	
	
	//디폴트 생성자
	//	-> ctrl + space 하면 자동 추천 해준다
	public StudentService() {
		
		stu = new Student();
		input = new Scanner(System.in);
		
	}
	
	
	//이름과 나이 입력
	public void insertInfo() {
		
		System.out.print("Input Name : ");
		stu.setName( input.nextLine() );
		
		System.out.print("Input Age : ");
		stu.setAge( input.nextInt() );
		
	}
	
	//국영수 점수 입력
	public void insertScore() {
		
		System.out.print("Input Korean : ");
		stu.setKor( input.nextInt() );
		
		System.out.print("Input English : ");
		stu.setEng( input.nextInt() );
		
		System.out.print("Input Mathematics : ");
		stu.setMath( input.nextInt() );
		
		//총점 계산하기
		calcSum();
		
		//평균 계산하기
		calcAvg();
	}
	
	//총합 계산
	private void calcSum() {
		stu.setSum( stu.getKor() + stu.getEng() + stu.getMath() );
	}
	
	//평균 계산
	private void calcAvg() {
		stu.setAvg( stu.getSum() / (double)3 );
	}
	
	//학생 정보 출력
	public void printStu() {
		
		System.out.println();
		System.out.println("- - - 학생 정보 - - -");
		
		System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print( stu.getName() + "\t" );
		System.out.print( stu.getAge() + "\t" );
		System.out.print( stu.getKor() + "\t" );
		System.out.print( stu.getEng() + "\t" );
		System.out.print( stu.getMath() + "\t" );
		System.out.print( stu.getSum() + "\t" );
		System.out.printf( "%.2f", stu.getAvg() );
		System.out.println();
		
	}
	
}














