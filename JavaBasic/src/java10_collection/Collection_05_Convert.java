package java10_collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Collection_05_Convert {
	public static void main(String[] args) {
		
		List list = Arrays.asList( "Apple", "Banana", "Cherry" );
	
		//--------------------------------------------
		
		Set set = new HashSet( list );
		System.out.println( set );
		
		//--------------------------------------------
		
		LinkedList linkedList = new LinkedList( set );
		System.out.println(linkedList);
		
		//--------------------------------------------
		
		Vector vector = new Vector( linkedList );
		System.out.println(vector);
		
	}
}















