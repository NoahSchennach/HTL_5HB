package generics;

public class Pair1<T,U> {

	private T first;
	private U second;
	
	
	public Pair1( T first, U second) {
		this.first = first;
		this.second = second;
	}


	public T getFirst() {
		return first;
	}


	public U getSecond() {
		return second;
	}
	
	
	public void setFirst(T first) {
		this.first = first;
	}


	public void setSecond(U second) {
		this.second = second;
	}


	public Pair1<U,T> swap() {
		return new Pair1<>(this.second, this.first);
	}

	
	
	
	
}
