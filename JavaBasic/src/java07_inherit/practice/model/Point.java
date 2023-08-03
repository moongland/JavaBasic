package java07_inherit.practice.model;

public class Point {

	//좌표
	protected int x;
	protected int y;

	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//x, y 좌표값 출력
	public void draw() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}






