package java04_control.selection;

public class Switch_03 {
	public static void main(String[] args) {
		
		//에러
//		double d = 3.14;
//		switch( d ) {
//		}
		
		//--------------------------------------
		
		//에러
//		boolean b = true;
//		switch( b ) {
//		}
		
		//--------------------------------------
		
		//char형은 정수값(ASCII CODE)으로 처리할 수 있다
		char alpha = 'B';
		
		switch( alpha ) {
		case 'A':
			System.out.println("사과");
			break;
		case 66: //case 'B':
			System.out.println("바나나");
			break;
		}
		
		//--------------------------------------
		
		//switch에서 String타입 사용 가능하다
		//	JDK 1.7이상 사용 가능
		
		String str = "Banana";
		
		switch(str) {
		case "Apple":
			System.out.println("사과입니다");
			break;
		case "Banana":
			System.out.println("바나나입니다");
			break;
		}
		
		//--------------------------------------
		
		// 문자열은 리터럴 상수로 대입했을 때의 참조값(주소)와
		//new연산자로 객체 생성해서 대입했을 때의 참조값(주소)가
		//서로 다르다
		
		//문자열이 같은 지 비교할 땐 ==연산자(동등연산자)를 사용하면 안된다
		//	-> ==연산자는 저장된 주소만 비교한다
		
		//.equals() 메소드를 사용하여 비교해야 한다
		//	-> 문자열을 한글자씩 모두 같은 지 비교한다 
		
		
		str = "Apple";	//문자열 상수 주소
//		str = new String("Apple");	//객체 생성한 주소
		
		if( str == "Apple" ) {
			System.out.println("if ==사과");
		}
		
		if( str.equals("Apple") ) {
			System.out.println("if .equals사과");
		}
		
	}
}


















