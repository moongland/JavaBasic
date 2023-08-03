package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_2_DataInputStream {
	public static void main(String[] args) {
		
		//입력 파일 객체
		File file = new File("./src/java13_io/filterStream", "DataTest.txt");

		
		//데이터 입력 스트림
		DataInputStream dis = null;
		
		
		try {
			//데이터 입력 스트림 생성
			dis = new DataInputStream(
					new BufferedInputStream(
						new FileInputStream(file) ) );
			

			//int자료형을 유지하며 입력받기
			//	-> 원본 형식을 무시한 경우 알아보기
			//	 힘든 값으로 처리된다	 
//			System.out.println( dis.readInt() ); //4B
			
			int data = dis.read();
			System.out.println( data );
			
			byte[] buf = new byte[10];
			dis.read( buf, 0, 5 );
			System.out.println( new String(buf, 0, 5) );
			
			
			boolean bData = dis.readBoolean();
			char chData = dis.readChar();
			int intData = dis.readInt();
			
			System.out.println(bData);
			System.out.println(chData);
			System.out.println(intData);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기
				if(dis!=null)	dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}














