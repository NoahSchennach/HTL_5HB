package typebound;

public class Rectangle extends Shape {

	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle:" + getColor());
	}

}
