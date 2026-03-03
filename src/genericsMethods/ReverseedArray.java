package genericsMethods;

import java.util.Arrays;

public class ReverseedArray {

	
	public static <T> T[] reverseArray(T[] array) {
		T[] reversedArray;
		for(int i =0; i < array.length /2 ; i++) {
			T current = array[i];
			array[i] = array[(array.length-1)-i];
			array[(array.length-1)-i] = current;
		}
		
		return array;
			
			
		}
		
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] intArray = {1,2,3,4};
		String[] stringArray = {"A","B","C"};
		
		System.out.println(Arrays.toString(reverseArray(intArray)));
		System.out.println(Arrays.toString(reverseArray(stringArray)));

	}

}
