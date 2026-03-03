package inner.classes.local.type;

public class Calculate1 {
	
	static int calculateAverage(int[]numbers) {
		
		class Durschn{
			int calculate() {
				int erg = 0;
				int u =0;
				for(int i = 0; i<numbers.length;i++) {
					
					erg = erg + numbers[i];
					
					u++;
				} ; return erg/u;
			}
		}
		return new Durschn().calculate();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {100,150,300};
		
		System.out.println(calculateAverage(arr1));
	}

}
