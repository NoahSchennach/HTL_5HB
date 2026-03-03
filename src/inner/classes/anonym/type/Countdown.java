package inner.classes.anonym.type;

public class Countdown {
	
	public Countdown() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i =10; i >=0; i--) {
					System.out.println(i);
					if(i == 0) {
						System.out.println("success");
					}
				}
				
			}
			
		};
		new Thread(r).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Countdown c = new Countdown();
	}

}
