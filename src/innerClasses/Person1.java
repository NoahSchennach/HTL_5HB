package innerClasses;

public class Person1 {
	private String name;
	
	
	
	public Person1(String name) {
		super();
		this.name = name;
	}



	class Details{
		void showName() {
			System.out.println(Person1.this.name);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 p = new Person1("lylo");
		
		Person1.Details d = p.new Details();
		
		d.showName();
	}

}
