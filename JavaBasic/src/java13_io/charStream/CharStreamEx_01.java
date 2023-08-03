package java13_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	
	public static void main(String[] args) {
	
		//문자 스트림, Character Stream
		//	문자(char, 2B)단위로 통신하는 스트림
		
		//	기본 스트림은 1B단위로 통신하는 바이트 스트림이다
		//	바이트 스트림을 문자 스트림으로 변환해서 사용해야 한다
		
		//	class InputStreamReader
		//		바이트입력스트림 -> 문자입력스트림
		//		InputStream -> Reader
		
		//	class OutputStreamWriter
		//		바이트출력스트림 -> 문자출력스트림
		//		OutputStream -> Writer
		
		//-----------------------------------------------------------------
		
		//문자스트림을 이용하여 키보드의 입력을 모니터로 출력하기
		
		Reader reader = new InputStreamReader( System.in );		//표준 입력스트림 : 키보드
		Writer writer = new OutputStreamWriter( System.out ); 	//표준 출력스트림 : 모니터(콘솔)
		
		
		//스트림 보조 변수
		char[] cbuf = new char[1024]; //임시 저장소
		int len = -1; //입력한 데이터의 길이
		
		
		try {
			
			//입력할 데이터가 스트림에 남아있으면 반복해서 입력받는다
			while( (len = reader.read( cbuf )) != -1 ) {
				
				//입력한 데이터 출력
				writer.write(cbuf, 0, len);
				
				//버퍼 비우기
				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//입력 스트림 닫기
				if(reader!=null)	reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				//출력 스트림 닫기
				if(writer!=null)	writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

















