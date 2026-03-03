package generics;

public class Pair1Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair1<Integer, String> p1 = new Pair1<>(10,"elf");
	
		System.out.println(p1.getFirst());
		System.out.println(p1.getSecond());
		
		Pair1<String, Integer> p1Swapped = p1.swap();
		
		System.out.println(p1Swapped.getFirst());
	
		
	}

}
