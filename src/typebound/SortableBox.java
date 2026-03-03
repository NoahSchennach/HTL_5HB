package typebound;

public class SortableBox<T extends Comparable<T>> {

	private T content;
	
	
	
	public SortableBox(T content) {
		super();
		this.content = content;
	}


	public T getContent() {
		return content;
	}


	public void setContent(T content) {
		this.content = content;
	}




	public int compareToOtherBox(SortableBox <T> sb) {
		return this.content.compareTo(sb.getContent());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortableBox<Integer> s1 = new SortableBox<Integer>(10);
		SortableBox<Integer> s2 = new SortableBox<Integer>(30);

		System.out.println(s1.compareToOtherBox(s2));
		
		
		SortableBox<String> st1 = new SortableBox<String>("Hallo");
		SortableBox<String> st2 = new SortableBox<String>("Zeile");
		
		System.out.println(st1.compareToOtherBox(st2));
		
		
	}

}
