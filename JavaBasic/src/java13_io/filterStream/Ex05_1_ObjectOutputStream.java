package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex05_1_ObjectOutputStream {
	public static void main(String[] args) {
		
		//파일 객체
		File file = new File("./src/java13_io/filterStream/", "ObjectTest.ser");
		
		
		//객체 출력 스트림
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(file) ) );
			
			
			//출력에 사용될 데이터 객체
			Point p1 = new Point(11, 22);
			Point p2 = new Point(111, 222);
			Point p3 = new Point(1111, 2222);
			
			//객체 출력
			oos.writeObject( p1 );
			oos.writeObject( p2 );
			oos.writeObject( p3 );
			
			//--------------------------------------------------------
			
			ArrayList<Point> list = new ArrayList<>();
			list.add( new Point(55, 66) );
			list.add( new Point(77, 88) );

			//컬렉션 객체 출력
			oos.writeObject( list );
			
			
			//버퍼 비우기
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(oos!=null)	oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
















