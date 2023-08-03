package java08_abstract;

//자식클래스

public class Professor extends Person {

	//전공
	private String major;
	
	public Professor(String name) {
		super(name);
	}

	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public void display() {
		System.out.println("[교수] " + name + ", " + major + " 전공");
	}

}










