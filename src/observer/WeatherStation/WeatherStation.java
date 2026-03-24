package observer.WeatherStation;

public interface WeatherStation {
	void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    public void setTemperature(double temperature);


}
