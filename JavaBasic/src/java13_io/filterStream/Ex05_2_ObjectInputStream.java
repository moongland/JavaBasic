package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex05_2_ObjectInputStream {
	public static void main(String[] args) {
		
		//파일 객체
		File file = new File("./src/java13_io/filterStream/", "ObjectTest.ser");

		//객체 입력 스트림
		ObjectInputStream ois = null;
		
		
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(file)));

			//객체 입력
			Object obj = ois.readObject();
			System.out.println( obj );
			
			Point obj2 = (Point) ois.readObject();
			System.out.println( obj2 );
		
			Point obj3 = (Point) ois.readObject();
			System.out.println( obj3.getX() );
			System.out.println( obj3.getY() );
			
			//-------------------------------------------------
			
			ArrayList<Point> list = (ArrayList<Point>) ois.readObject();
			
			System.out.println( list );
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(ois!=null)	ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}













