package inner.classes.anonym.type;

import java.util.Arrays;
import java.util.Comparator;



public class anonymComp {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1 = {"Hallos","moins","seas"};
		
		
		Arrays.sort(s1,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(),o2.length());
			}
			
		});
		


	for (String s : s1) {
		System.out.println(s);
	}
	}

}
