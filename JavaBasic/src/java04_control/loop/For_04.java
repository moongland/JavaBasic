package java04_control.loop;

public class For_04 {
	public static void main(String[] args) {
		
		//	"Hello" 를 7번 출력하시오
		
		//반복횟수 : x7
		//반복구간 : 0 ~ 6
		
		//반복하면서 수행할 코드(작업) : "Hello" 출력
		
		
		//초기식:	int i=0;	(i 변수 선언, 반복 구간의 시작값으로 대입)
		//조건식:	i < 7;		(i 변수 검사, 반복횟수보다 작은 조건으로 설정)
		//증감식:	i++			(1씩 증가)
		
		for( int i=0; i < 7; i++ ) {
			System.out.println("Hello");
		}
		
		//	i변수가 0부터 7보다 작은 동안 1씩 증가하면서 "Hello" 출력
		
	}
}


















