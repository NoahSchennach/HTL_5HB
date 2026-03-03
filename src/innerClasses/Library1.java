package innerClasses;

public class Library1 {
	static String name = "Stadtbib";
	
	static class Book{
		
		void showLibrary() {
			System.out.println(name);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book();
		b.showLibrary();
	}

}
