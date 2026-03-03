package typebound;

public class Circle extends Shape {

	public Circle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle:" + getColor());
	}

}
