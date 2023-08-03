package java10_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Collection_09_Queue {
	public static void main(String[] args) {
		
		//큐, Queue
		
		//	FIFO, First Input First Output, 선입선출
		//	LILO, Last Input Last Output, 후입후출
		
		//	대기열 시스템을 구축할 때 사용한다
		
		//큐의 메소드

		//	offer()	: 데이터 입력, enqueue(인큐)
		//	poll()	: 데이터 출력 및 삭제, dequeue(데크)
		
		//	peek()	: 데이터 확인, poll()될 데이터 확인(삭제X)
		//---------------------------------------------------------------
		
		ArrayList list;
		
		Queue queue = new LinkedList();
		
		queue.offer("Alice");
		queue.offer("Bob");
		queue.offer("Clare");
		
		System.out.println( queue ); 
		
		System.out.println("---------------");
		
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );
		
		System.out.println("---------------");
		
		System.out.println( queue.peek() );
		System.out.println( queue );
		
	}
}

















