package java10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {
	public static void main(String[] args) {
		
		//interface Iterator
		//	반복자
		//	컬렉션의 모든 요소들을 순차적(반복적)으로 접근할 때 사용한다
		
		//	 Iterable 인터페이스를 상속받은 클래스의 .iterator() 메소드를
		//	실행하면 Iterator 객체를 얻을 수 있다
		
		//--------------------------------------------------------------------
	
		//Arrays.asList(T... a) 메소드
		//	전달인자로 나열된 데이터들을 순서대로 삽입한 ArrayList객체를 반환한다
		
		List<Object> list = Arrays.asList("A", "B", "C", "D", "E");
		System.out.println( list );
		
		//--------------------------------------------------------------------
		
		//반복자 변수 선언
		Iterator iter = null;
		
		//list객체를 이용하여 Iterator객체 생성
		iter = list.iterator();

		//--------------------------------------------------------------------
		
		//Iterator의 주요 메소드
		
		//	public E next()
		//		다음 요소의 데이터를 반환한다
		
		//	public boolean hasNext()
		//		다음 요소가 존재하는지 확인한다
		//		true / false 반환
		
		//--------------------------------------------------------------------
		
		//요소가 존재하는 만큼 하나씩 반복한다
		while( iter.hasNext() ) {
			
			//요소를 반환하고 다음 요소를 참조하도록 만든다
			Object data = iter.next();
			
			System.out.println( data );
			
		}
		
		//--------------------------------------------------------------------
		System.out.println("-----");
		
		//요소의 길이만큼 인덱스를 이용한 반복
		for(int i=0; i<list.size(); i++) {
			
			Object data = list.get(i);
			
			System.out.println( data );
			
		}
		
		//--------------------------------------------------------------------
		System.out.println("-----");

		// for-each 구문을 이용한 반복
		for( Object data : list ) {
			System.out.println( data );
		}
		
		//--------------------------------------------------------------------
		System.out.println("-----");
		
		int[] arr = { 11, 22, 33, 44 };
		
		for( int num : arr ) {
			System.out.println( num );
		}
		
		//--------------------------------------------------------------------
		System.out.println("-----");
		
		// Integer 타입을 요소로 가지는 리스트
//		List<Integer> iList = new ArrayList<Integer>();
		List<Integer> iList = new ArrayList<>();
		
		iList.add( 100 );
		iList.add( 200 );
		iList.add( 300 );
		
		//Wrapper 클래스 가능
//		for( Integer iVal : iList ) {
//		}

		//기본타입 int 가능
		for( int iVal : iList ) {
			System.out.println( iVal );
		}
		
		//--------------------------------------------------------------------
		System.out.println("-----");
		
		List testList = new ArrayList();
		
		testList.add( "Apple" );
		testList.add( true );
		testList.add( 100 );
		
		for( Object data : testList ) {
			System.out.println( data );
		}
		
	}
}



















