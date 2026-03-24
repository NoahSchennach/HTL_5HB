package observer.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements WeatherStation {
	  private List<Observer> observers;
	    private double temperature;

	  
	
	
	   public TemperatureSensor(List<Observer> observers, double temperature) {
			this.observers = new ArrayList<Observer>();
			this.temperature = temperature;
		}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update(temperature);
		}
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

}
