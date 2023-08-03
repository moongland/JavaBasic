package java07_inherit.practice.model;

public class Rectangle extends Point {

	private int width; //가로너비
	private int height; //세로높이

	public Rectangle() {}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		
		this.width = width;
		this.height = height;
	}

	
	@Override
	public void draw() {
		
		//기준점
		System.out.print("기준점 : ");
		super.draw();
		
		//면적
		System.out.printf("면적 : %.1f", width*(double)height);
		System.out.println();
		
		//둘레
		System.out.printf("둘레 : %.1f", 2*(width + (double)height));
		System.out.println();
		
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}














