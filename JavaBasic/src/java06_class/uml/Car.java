package java06_class.uml;

public class Car {

	private String model;	//차종
	private String color;	//색상
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void display() {
		System.out.println(model + ", " + color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}















