package innerClasses;

public class Calculator {

	public static class Addition{
		public int add(int a, int b) {
			return a+b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a1 = new Calculator.Addition();
		System.out.println(a1.add(10, 10));
	
		
	}

}
