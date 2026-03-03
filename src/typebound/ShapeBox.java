package typebound;

import java.util.ArrayList;
import java.util.List;

public class ShapeBox<T extends Shape> {

	private List<T> l1;
	
					
	public ShapeBox() {
		this.l1 = new ArrayList<T>();
	}

	public void drawShape() {
		for(T shape : this.l1) {
			shape.draw();
		}
	}
	
	
	public void addShape(T shape) {
		this.l1.add(shape);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle("Blue");
		Circle c2 = new Circle("pink");
		
		
	
		
		
		
	}

}
