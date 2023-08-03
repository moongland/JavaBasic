package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection_01_List {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();	//빈(empty) 리스트
		
		System.out.println( list );		// [] (== empty)
		
		System.out.println();
		System.out.println("--- 데이터 삽입 -------");
		
		// .add()를 실행한 순서대로 인덱스를 부여받는다 ( 0시작 )
		list.add("Apple");
		list.add("Cherry");
		list.add("Banana");
		
		System.out.println( list );
		
		
		System.out.println();
		System.out.println("--- 데이터 조회 -------");
		
		System.out.println("1번째 요소 : " + list.get(1));
		
		System.out.println("리스트의 크기 : " + list.size());
		
		//size() : 리스트의 크기(길이)를 반환한다
		//	배열객체.length
		//	리스트.size()
		
		
		System.out.println();
		System.out.println("--- 데이터 수정 -------");
		
		list.set(0, "Orange");
		
		System.out.println( list );
	
		
		System.out.println();
		System.out.println("--- 데이터 삭제 -------");
		
//		.remove(int index)	-> 인덱스로 요소를 지정하여 삭제
//		.remove(Object obj)	-> 요소의 값을 비교하여 삭제
		
		list.remove(1);	//1번째 인덱스 삭제
		System.out.println( list );
	
		list.remove("Apple");
		System.out.println( list );
		
		list.remove("Orange");
		System.out.println( list );
		
		//--------------------------------------------------------------
		
		//	삽입, 조회, 수정, 삭제
		
		//	CRUD
		
		//	Create	- 추가/삽입/생성
		//	Read	- 조회/탐색
		//	Update	- 수정/변경
		//	Delete	- 삭제/제거
		
		//--------------------------------------------------------------
		
		System.out.println();
		System.out.println("--- isEmpty -------");
		
		//리스트가 비어있는지 확인
		System.out.println( list.isEmpty() );	//false
		
		
		ArrayList l1 = null; //리스트를 생성하지 않음
		ArrayList l2 = new ArrayList(); //리스트를 생성함, 비어있음
		
		System.out.println("l1 : " + l1);
		System.out.println("l2 : " + l2);
		
		
//		l1.isEmpty();	//에러, NullPointerException
		System.out.println( l1 == null ); //true
		
		l2.isEmpty();	//true
		System.out.println( l2 == null ); //false
		
		
		System.out.println();
		System.out.println("--- clear -------");
		
		list.clear(); // 모든 요소 제거
		System.out.println( list ); //비어있음
		
		
		System.out.println();
		System.out.println("----------");
		
		//** 컬렉션들은 요소의 데이터타입을 정해놓고 사용하길 권장한다
		//	-> 제네릭(<>)으로 정한다
		
		//** 특정 데이터타입으로 정하지 않으면 Object로 사용되도록 만들어진다
		//	-> raw type
		
		//** Object타입이더라도 직접 명시해서 타입을 결정하면 문제가 되지 않는다
		
		list.add("문자열");	//String -> Object
		
		list.add(12345); //int -> Integer -> Object
		
		list.add(3.14); //double -> Double -> Object
		
		System.out.println( list );

		
		System.out.println();
		System.out.println("----------");
		
		if( null != l2 ) {	//리스트객체를 생성했는지 검사
			if( !l2.isEmpty() ) {	//요소가 존재하는지 검사
				
				System.out.println( l2.get(0) );
				
			}
		}
		
		System.out.println();
		System.out.println("----------");
		
		int[] arr = { 1,2,3,4,6,6 };

		Arrays.fill(arr, 0);

		System.out.println( Arrays.toString(arr) );
		
		//** Arrays.fill(배열, 값);
		//	배열의 모든 요소를 지정된 값으로 초기화한다
		
	}
}

















