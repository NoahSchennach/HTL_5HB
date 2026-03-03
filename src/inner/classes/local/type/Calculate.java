package inner.classes.local.type;

public class Calculate {

	
	public static double calculateAverage(int[]numbers) {
		
		class DurschnittsBerechner {
			public double calculate() {
				int i = 0;
				double sum = 0;
				for(int a = 0; a < numbers.length; a ++) {
					i++;
					sum = sum + numbers[a];
				
				
			} ;
			return sum / i;
			
			
		
			}
		
		}
		return new DurschnittsBerechner().calculate();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3};
		int[] arr1 = {100,150,300};

		
		System.out.println(calculateAverage(arr1));
			
		
	}

}
