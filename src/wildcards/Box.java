package wildcards;

public class Box<T extends Comparable<T>> {

	private T content;
	
		
	public Box(T content) {
		super();
		this.content = content;
	}

	

	public T getContent() {
		return content;
	}



	public void setContent(T content) {
		this.content = content;
	}



	public int compareBoxes(Box<?> content2){
		return this.content.compareTo(content2.getClass());
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> b1 = new Box<>("Hallo");
		Box<String> b2 = new Box<>("h1");
		
		System.out.println(b1.compareBoxes(b2));
		
	}

}
