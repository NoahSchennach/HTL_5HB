package lambda;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

;

public class LambdaExpressions {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = () -> {System.out.println("eawas");};
		ActionListener listener = (ActionEvent e) -> 
					{System.out.println("hawidere");};
		
		Supplier<String> supplier = () -> 
					{return "arvus";};
		
		Consumer<Point> consumer = (Point t) -> 
					{System.out.println("griaß di");};
		
		Comparator<Rectangle> comparator = 
				(Rectangle o1, Rectangle o2) ->
					{return 20;};
		
		
			
		}
				
	
	

}

