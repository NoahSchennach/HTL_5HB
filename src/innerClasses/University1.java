package innerClasses;

public class University1 {

	class Student{
		void showData(String name, int id) {
			System.out.println("name:" + name + "id:" + id);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		University1 u = new University1();
		University1.Student s = u.new Student();
		s.showData("klaus", 1);
	}

}
