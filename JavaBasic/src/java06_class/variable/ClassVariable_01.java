package java06_class.variable;

public class ClassVariable_01 {

	//멤버 필드
	private int num = 999;
	private String name;
	
	public ClassVariable_01() {
		name = "Alice";
	}
	
	//멤버 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}



