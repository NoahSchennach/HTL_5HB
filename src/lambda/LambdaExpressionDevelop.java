package lambda;

import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.UnaryOperator;

public class LambdaExpressionDevelop {

	
	public static void main(String[] args) {
		
		DoubleSupplier ds = () -> {double a = 1.2; 
			double b = 2.1;
			return a+b;
		
		};
		
		LongToDoubleFunction ltdf = (long value) -> 
							{return value;};
							
		UnaryOperator<String> up = (String s) -> {return "n";};
		
	}
}
