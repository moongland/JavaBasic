package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter( System.out ) ), true );
		
		
		//** PrintWriter의 생성자에 두 번째 인자로 true를 설정하면
		//	AutoFlush 모드가 활성화된다
		//	-> print(), println(), printf() 메소드로 출력하면 자동 flush()한다
		
		
		// **사용할 메소드
//		in.readLine() : String
//		out.println( str )
		
		
		//입력받은 문자열
		String str = null;
		
		
		try {
			
			//입력 스트림에 입력받을 문자열이 있으면 반복
			while( (str = in.readLine()) != null ) {
				
				//입력된 문자열 출력
				out.println( str );
				
				//버퍼 비우기
//				out.flush();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				//입력스트림 닫기
				if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//출력 스트림 닫기
			if(out!=null)	out.close();
			
		}
		
	}
}

















