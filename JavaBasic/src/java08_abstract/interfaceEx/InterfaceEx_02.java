package java08_abstract.interfaceEx;

import java08_abstract.interfaceEx.multiple.Child;
import java08_abstract.interfaceEx.multiple.Inter_01;
import java08_abstract.interfaceEx.multiple.Inter_02;
import java08_abstract.interfaceEx.multiple.Parent;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();
		System.out.println("----------");

		Parent p = new Parent();
		p.out();
		System.out.println("----------");
	
		Parent pc = new Child();
		pc.out();	//동적 바인딩 -> 자식 클래스의 메소드를 호출한다
		System.out.println("----------");
		
		//** extends한 클래스, implements한 인터페이스 모두 부모 데이터타입이 된다
		
		Inter_01 i01;	//인터페이스 객체 변수
		i01 = new Child();	//자식 객체 생성
		
		i01.out(); //동적 바인딩
		System.out.println("----------");
		
		Inter_02 i02 = new Child();
		i02.out();
		
	}
}

//** 다중 상속
//	여러 개의 클래스를 상속받는 것

//** 자바는 다중 상속을 금지하고 있다
//	-> extends로 한 개의 클래스만 상속받을 수 있다

//** 인터페이스를 다중 상속하는 것은 허용된다

//class P1 {
//	public void display() {
//		System.out.println("P1");
//	}
//}
//
//class P2 {
//	public void display() {
//		System.out.println("P2");
//	}
//}
//
//class Children extends P1, P2 {
//	
//	@Override
//	public void display() {
//		//** 다중 상속을 허용한다면
//		//	P1, P2 클래스중에서 어떤 클래스의
//		//	메소드를 상속받아야하는 지 결정할 수 없다
//	}
//	
//}





















