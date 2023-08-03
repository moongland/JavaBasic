package java11_generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		// public class ArrayList<E>

		//	클래스를 정의할 때 <E> 처럼 제네릭 타입을 적용할 수 있다
		
		//	클래스의 내부 코드에서 E 를 자료형으로 사용할 수 있다
		
		//	 타입 파라미터(Type Parameter)를 제네릭 타입으로 지정해놓고
		//	해당 클래스를 이용할 때 특정 자료형으로 결정해서 사용한다
		
		//	정의할 때 일반화된 데이터타입 사용 ( == 제네릭 타입, 타입 파라미터 )
		//	사용할 때(생성, 선언) 특정 자료형으로 결정해서 사용
		
		//------------------------------------------------------------------------
		
		//ArrayList의 타입파라미터 E 를 String으로 결정하여 객체 변수 선언
		ArrayList<String> list;
		
		
		//타입 파라미터를 결정하지 않으면 "raw type" 이라고 한다
		//	-> Object타입으로 자동 결정된 것
		ArrayList list2;
		
		//------------------------------------------------------------------------

		list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		
		//에러, 타입파라미터를 String으로 결정했기 때문에 String만 사용할 수 있다
//		list.add(12345);
		
		//------------------------------------------------------------------------
		
		//에러, 타입파라미터는 기본 데이터타입을 사용할 수 없다
//		ArrayList<int> list3;
		
		//Wrapper클래스를 사용해야 한다
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list3.add(100);
		list3.add(200);
		
		//------------------------------------------------------------------------
		
		//** 타입 안정성, Type Safety
		//	객체 또는 메소드가 의도한 데이터타입으로만 사용되는 상황
		
		//	타입 파라미터를 특정 데이터타입으로 결정하면 "타입 안정성"이 제공된다
		
		ArrayList list4 = new ArrayList();
		
		list4.add("HI");
		list4.add("Hello");
		list4.add("Hola");
		
		//에러, Object타입으로 반환한다
//		String str = list4.get(1);
		
		//형변환이 필요하다
		String str = (String) list4.get(1);
		
		//------------------------------------------------------------------------
		
		ArrayList<String> list5 = new ArrayList<>();
		
		list5.add("A");
		list5.add("B");
		list5.add("C");

		String data = list5.get(1);
		System.out.println( data );
		
		System.out.println("---");
		
		Iterator<String> iter = list5.iterator();
		while( iter.hasNext() ) {
			String val = iter.next();
			System.out.println( val );
		}
		
		System.out.println("---");

		for( String s : list5 ) {
			System.out.println( s );
		}
		
	}
}

















