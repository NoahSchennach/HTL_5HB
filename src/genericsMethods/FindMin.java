package genericsMethods;

public class FindMin {

	public static <T extends Comparable<T>> void findMin(T first, T second) {
		if(first.compareTo(second) > 0) {
			System.out.println(second);
		}
		System.out.println(first);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findMin(15,10);
		findMin("Dog","Elefant");
	}

}
