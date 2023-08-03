package java06_class.defaultTest;

import java06_class.Class_02;

public class Main_03_DefaultTest {
	public static void main(String[] args) {
		
		Class_02 cl = new Class_02();
		
		System.out.println( cl.num4 ); //public
		
		//에러
//		System.out.println( cl.num3 ); //protected
//		System.out.println( cl.num2 ); //default
//		System.out.println( cl.num1 ); //private

	}
}

















