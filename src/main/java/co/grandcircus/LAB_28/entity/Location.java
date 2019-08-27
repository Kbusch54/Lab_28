package co.grandcircus.LAB_28.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	private  String longitude;
	private String latitude;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Location [longitude=" + longitude + ", latitude=" + latitude + "]";
	}

	
}
