package generics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPair1 {
 
	@Test
  public void testFirstfromPair() {
		Pair1<Integer, String> p1 = new Pair1<>(10,"elf");
		Integer result = p1.getFirst();
		Assert.assertEquals(result, 10);
		

  }
	
	@Test
	  public void testSecondfromPair() {
			Pair1<Integer, String> p1 = new Pair1<>(10,"elf");
			String result = p1.getSecond();
			Assert.assertEquals(result, "elf");
			

	  }	
	
	@Test
	  public void testSwappedFirstfromPair() {
			Pair1<Integer, String> p1 = new Pair1<>(10,"elf");
			Pair1<String, Integer> p2 = p1.swap();
			String result = p2.getFirst();
			Assert.assertEquals(result, "elf");
	  }
	
	@Test
	  public void testSwappedSecondfromPair() {
			Pair1<Integer, String> p1 = new Pair1<>(10,"elf");
			Pair1<String, Integer> p2 = p1.swap();
			Integer result = p2.getSecond();
			Assert.assertEquals(result, 10);
			
	}
	
	
}
