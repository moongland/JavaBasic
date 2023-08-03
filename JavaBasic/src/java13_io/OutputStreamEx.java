package java13_io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		//모니터 표준 출력 스트림 객체
		OutputStream os = System.out;
		
//		try {
//			
//			//write()메소드는 출력스트림의 출력버퍼로 출력한다
//			os.write(65);
//			os.write(66);
//			os.write(67);
//			
//			//flush()메소드는 출력버퍼의 데이터를 출력장치로 내보낸다
//			os.flush();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//-------------------------------------------------------------------
		
		//출력 데이터 저장소
		byte[] buf = new byte[10];
		
		//출력할 데이터의 길이
		int len = 0;
		
		
		//출력할 데이터
		buf[len++] = 'A';
		buf[len++] = 'p';
		buf[len++] = 'p';
		buf[len++] = 'l';
		buf[len++] = 'e';
		buf[len++] = '\n';
		
		
		try {
			
			//데이터 출력
			os.write(buf, 0, len);
			
			//출력 버퍼 비우기
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//스트림 닫기
				if( os!=null)	os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}















