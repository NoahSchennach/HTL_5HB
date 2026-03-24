package observer.WeatherStation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureSensor subject = new TemperatureSensor(null, 0);
        Observer dashboard = new WebDashboard();

        subject.addObserver(dashboard);

        subject.setTemperature(31);
		
	}

}
