package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExpressionInterfacesExcercises {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Runnable r = () -> {
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
		;};
	
	Supplier<Integer> supplier = () -> { return (int) Math.random()* 100;};	
	supplier.get();
	
	Consumer<String> c = (String s) -> {System.out.println(s.toUpperCase());};
	c.accept("Moin");
	
		
	List<String> l = new ArrayList<>();
	l.add("seas");
	l.add("hawidere");
	
	Comparator<String> c1 = (String s1, String s2) -> {return Integer.compare(s1.getLength(), s2.getLength())};
		
		
		
		
		
		
		
		
		
		
	}

}
