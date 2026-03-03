package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Max","Anna","Clara","Bernd");
		
		List<String> l1 = new ArrayList<String>(names);
		l1.sort((a,b) -> a.compareTo(b));
		System.out.println(l1);
		
		List<String> l2 = new ArrayList<String>(names);
		l2.sort((a,b) -> Integer.compare(b.length(), a.length()));
		System.out.println(l2);
		
	}

}
