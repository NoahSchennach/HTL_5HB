package generics;

public class PairTest {

public static void main(String [] args) {
	Integer i1 = 11;
	Integer i2 = 35;
	
	Pair iPair = new Pair(i1,i2);
	
	double d1 = 13.33;
	double d2 = 75.75;
	
	Pair dPair = new Pair(d1,d2);
	
	Car c1 = new Car("Audi",65);
	Car c2 = new Car("Koennigsegg", 1200);
	
	
	Pair cPair = new Pair(c1,c2);

	System.out.println(cPair.getFirst());

	Car c3 = (Car)cPair.getSecond();


	Pair icPair = new Pair(i1,c2);
}
}
