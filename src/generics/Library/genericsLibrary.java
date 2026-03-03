package generics.Library;

import java.util.ArrayList;

public class genericsLibrary<T,U,V> {
	
	private ArrayList<T> objects;
	private ArrayList<U> objects2;
	private ArrayList<V> objects3;


	public genericsLibrary() {
		this.objects = new ArrayList<T>();
		this.objects2 = new ArrayList<U>();
		this.objects3 = new ArrayList<V>();


	}
	
	public void addMedia(T media) {
		this.objects.add(media);
	}
	
	public void addMedia(U media) {
		this.objects2.add(media);
	}
	
	public void addMedia(V media) {
		this.objects3.add(media);
	}
	
	public void retrieveLast() {
		
	}
}
