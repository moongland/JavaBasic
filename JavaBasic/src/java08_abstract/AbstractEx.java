package java08_abstract;

public class AbstractEx {
	public static void main(String[] args) {
		
		Professor pf = new Professor("Alice", "컴퓨터");
		Student st = new Student("Bob", "자바");
		
		pf.display();
		st.display();
		
		System.out.println("-------------------------");
		
//		Person p1 = new Person("Edward");
		
		Person p2 = new Person("Favian") {
			@Override
			public void display() {
				System.out.println("익명 클래스");
			}
		};
		p2.display();
		
		Person p3 = new Professor("Clare", "인공지능");
		Person p4 = new Student("Dave", "알고리즘");
		
		p3.display();
		p4.display();
		
	}
}


















