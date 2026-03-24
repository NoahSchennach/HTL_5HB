package observer.WeatherStation;

public class WebDashboard implements Observer {

	@Override
	public void update(double temperature) {
		// TODO Auto-generated method stub
		 System.out.println("WebDashboard Anzeige:");
	     System.out.println("Temperatur: " + temperature + "°C");
	}

	
	
	
}
