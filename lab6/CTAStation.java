package lab6;

public class CTAStation extends GeoLocation {

	private String name;
	private String location;
	private boolean opened;
	private boolean wheelchair;
	
	
	public CTAStation() {
		super();
	}

	public CTAStation(String a, String b, boolean c, boolean d, double e, double f) {
		super(e, f);
		this.name = a;
		this.location = b;
		this.opened = c;
		this.wheelchair = d;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setOpened(boolean open) {
		this.opened = open;
	}
	public void setWheelchair(boolean chair) {
		this.wheelchair = chair;
	}
	
	
	public String getName() {
		return this.name;
	}
	public String getLocation() {
		return this.location;
	}
	public boolean getOpened() {
		return this.opened;
	}
	public boolean getWheelchair() {
		return this.wheelchair;
	}
	
	public double calcDistance(CTAStation a) {
		return super.calcDistance(a);
	}
	public double calcDistance(double a, double b) {
		return super.calcDistance(a, b);
	}
	
	
	
	public String toString() {
		return "Station: " + name + "\n  Location: " + location + "\n  Open: " + opened + "\n  Wheelchair: " + wheelchair;                 
	}
	
}
