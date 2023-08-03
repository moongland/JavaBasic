package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		//단항연산자 - 증감
	
		//	++	증가 연산자
		//	--	감소 연산자
		
		//	피연산자로 적용한 변수의 값을 1 증가(감소) 시킨다
		//----------------------------------------------------------
		
		int num;
		
		
		num = 15;
		
		num++;	// num변수의 값을 1 증가시킨다
		System.out.println( num );
		
		++num;	// num변수의 값을 1 증가시킨다
		System.out.println( num );
		
		System.out.println("-----");
		
		num = 15;
		
		num--;	//num변수의 값을 1 감소 시킨다
		System.out.println( num );
		
		--num;	//num변수의 값을 1 감소 시킨다
		System.out.println( num );
		
		//----------------------------------------------------------
		
		//증감 연산자는 다른 연산식과 함께 사용할 때 계산 방법이 달라진다
		//	-> 적용한 위치가 변수의 앞, 뒤인지에 따라 달라진다
		
		//----------------------------------------------------------
		System.out.println("-----");
		
		num = 15;
		
		System.out.println( num );
		System.out.println( num-- );	//감소연산자 적용, 후치 감소, 후위 감소
		System.out.println( num );
		
		System.out.println("-----");
		
		num = 15;
		
		System.out.println( num );
		System.out.println( --num );	//감소연산자 적용, 전치 감소, 전위 감소
		System.out.println( num );
		
		//	** 전위 증감연산자는 변수의 값을 불러오기 전에 변수의 값을 증감시킨다
		//	** 후위 증감연산자는 변수의 값을 불러오기 후에 변수의 값을 증감시킨다
		
		//----------------------------------------------------------
		
		System.out.println("-----");
		
		num = 13;
		
		System.out.println( num++ - 10 - ++num );
		
		System.out.println( num );
		
	}
}


















