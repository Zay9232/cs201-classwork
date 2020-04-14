package lab5;

public class GeoLocation {
	
	protected double latitude;
	protected double longitude;
	
	public GeoLocation(){
		this.latitude = 0;
		this.longitude = 0;
	}
	
	public GeoLocation(double a, double b) {
		this.latitude = a;
		this.longitude = b;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLatitude(double a) {
		this.latitude = a;
	}
	
	public void setLongitude(double b) {
		this.longitude = b;
	}
	
	public double calcDistance(GeoLocation geo2) {
		double x = (geo2.longitude - this.longitude);
		x = x*x;
		double y = (geo2.latitude - this.latitude);
		y = y*y;
		return Math.sqrt(x+y);
	}
	
	
	public double calcDistance(double a, double b) {
		double x = (a - this.longitude);
		double y = (b - this.latitude);
		x = x*x;
		y=y*y;
		return Math.sqrt(x+y);
	}

	public String toString() {
		return "Longitude: " + this.longitude + "   Latitude: " + this.latitude;
	}
}
