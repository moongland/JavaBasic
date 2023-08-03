package java10_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_04_Set {
	public static void main(String[] args) {
		
//		Set set = new HashSet(); // 기본 Set
//		Set set = new LinkedHashSet(); // 입력 순서 유지 Set
		Set set = new TreeSet(); // 정렬 순서 유지 Set
		
		
		//HashSet : 순서없이 저장한다
		//LinkedHashSet : 순서를 유지한다
		//TreeSet : 오름차순 정렬시켜 저장한다
		set.add(30);
		set.add(20);
		set.add(40);
		set.add(10);
		
		//중복 데이터 제거
		set.add(30);
		set.add(30);
		set.add(10);
		set.add(40);
		
		System.out.println( set );
		
		System.out.println("----------");
		
		//Set객체의 Iterator 사용하기
		Iterator iter = set.iterator();
		
		//Iterator를 통한 전체 데이터 출력
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
		System.out.println("----------");
		
		//for-each 구문을 이용한 전체 데이터 출력
		for(Object data : set) {
			System.out.println( data );
		}
		
		System.out.println("----------");
		
		System.out.println("크기? " + set.size());	// 4
		System.out.println("비었는지? " + set.isEmpty());	// false
		System.out.println("30 이 존재하는지? " + set.contains(30));	// true
		System.out.println("30 제거 : " + set.remove(30));	// true
		
		System.out.println("50 제거 : " + set.remove(50));	// false
		
		System.out.println( set );
		
		System.out.println("----------");
		
		//전체 데이터 삭제
		set.clear();
		
		System.out.println( set );
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println("크기? " + set.size());

	}
}


















