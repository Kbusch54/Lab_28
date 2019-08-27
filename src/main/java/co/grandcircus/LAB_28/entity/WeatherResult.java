package co.grandcircus.LAB_28.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResult {
	private String operationalMode;
	private Data data;
	private Location location;
	public WeatherResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOperationalMode() {
		return operationalMode;
	}
	public void setOperationalMode(String operationalMode) {
		this.operationalMode = operationalMode;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "WeatherResult [operationalMode=" + operationalMode + ", data=" + data + ", location=" + location + "]";
	}
	
	
	

}
