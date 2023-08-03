package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		//입력 대상 파일 객체
		File file = new File("./src/java13_io/fileStream", "input");
		System.out.println("[TEST] exists : " + file.exists());
		
		//파일 입력 관련 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼
		int len = -1; //입력된 데이터의 길이
		
		//최종 데이터 저장소
		StringBuilder sb = new StringBuilder();
		
		//파일 입력 스트림 객체
		FileInputStream fis = null;
		
		try {
			//파일 입력 스트림 생성
			fis = new FileInputStream(file);
			
			//읽어들일 데이터가 존재하면 반복 처리
			while( (len = fis.read(buf)) != -1 ) {
				sb.append( new String(buf, 0, len) );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println();
		System.out.println("<< 읽어들인 파일의 데이터 >>");
		
		System.out.print( sb );
		
	}
}















