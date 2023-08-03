package java07_inherit.practice.model;

public class Circle extends Point {

	//반지름
	private int radius; 

	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	
	@Override
	public void draw() {
		
		//중심점
		System.out.print("중심점 : ");
		super.draw();
		
		//원의 면적
		System.out.printf("면적 : %.1f", Math.PI * radius * radius);
		System.out.println();
		
		//원의 둘레
		System.out.printf("둘레 : %.1f", 2 * Math.PI * radius);
		System.out.println();
		
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}







