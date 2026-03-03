package innerClasses;


public class Library {
	
	private static String name = "Stadtbibliothek";

	public Library() {
		
	}
	
	public static class Book{
		public static String showLibrary() {
			return name;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Library.Book();
		System.out.println(b.showLibrary());
		
	}
}
