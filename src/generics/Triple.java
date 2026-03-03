package generics;

public class Triple<T,U,V> {

	private T fisrt;
	private U second;
	private V third;
	
	
	public Triple(T fisrt, U second, V third) {
		super();
		this.fisrt = fisrt;
		this.second = second;
		this.third = third;
	}


	public T getFisrt() {
		return fisrt;
	}

	public U getSecond() {
		return second;
	}

	public V getThird() {
		return third;
	}


	@Override
	public String toString() {
		return "Triple [fisrt=" + fisrt + ", second=" + second + ", third=" + third + "]";
	}

	
	
	
	
}
