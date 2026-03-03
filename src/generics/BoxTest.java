package generics;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> b1 = new Box<>(10);
		System.out.println(b1.getValue());
		
		Box<Double> d1 = new Box<>(10.2);
		System.out.println(d1.getValue());
		
		Box<String> s1 = new Box<>("moin");
		System.out.println(s1.getValue());
		
	}

}
