package lab6;

import java.util.ArrayList;

public class CTARoute {

	private String name;
	private ArrayList<CTAStation> stops;
	
	public CTARoute() {
		this.name = "";
		this.stops = new ArrayList<CTAStation>();
	}
	
	public CTARoute(String a, ArrayList<CTAStation> b) {
		this.name = a;
		this.stops = b;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<CTAStation> getStations(){
		return stops;
	}
	
	public void setName(String a) {
		this.name = a;
	}
	
	public void setStops(ArrayList<CTAStation> b) {
		this.stops = b;
	}
	
	public String toString() {
		return name + " Stops";
	}
	
	public void addStation(CTAStation a) {
		this.stops.add(a);
	}
	
	public void insertStation(CTAStation a, int pos) {
		this.stops.add(pos, a);
	}
	
	public void removeStation(String a) {
		for (int i = 0; i<this.stops.size(); i++ ) {
			if (stops.get(i).getName().equalsIgnoreCase(a)) {
				this.stops.remove(i);
			}
		}
	}
	
	public CTAStation lookupStation(String a) {
		for (int i = 0; i<this.stops.size(); i++ ) {
			if (stops.get(i).getName().equalsIgnoreCase(a)) {
				return stops.get(i);
			}
		}
		return null;
		
	}
	
	

}
