package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Handler<T> {
	
	

	public void addItems(List<? super T> l1, T value) {
		l1.add(value);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Handler<Integer> h1 = new Handler<>();
		List<Integer> list = new ArrayList<>();
		
		h1.addItems(list, 12);
		
		System.out.println(list);
		
	}

}
