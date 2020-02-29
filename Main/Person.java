package Main;

public class Person {
	String name;
	private int location;
	//Building building;
	private int status;

	public Person(String firstName, String lastName) {
		this.name = firstName +  " " + lastName;
		status = 0;
	}

	public boolean enterBuilding(Building building, int floor) {
		//this.building = building;
		status = 1;
		return building.enterElevatorRequest(this, floor);
	}

	public void setStatus(int statuss) {
		this.status = statuss;
	}
	public String getLocation() {
		//throw new UnsupportedOperationException();
		if(status == 0) {
			return  "In Lobby";
		} else if(status == 1) {
			return "Waiting to be serviced";
		}
		return "In Floor " + location ;
	}

	public void setLocation(int floor) {
		this.location = floor;
		//building.existFloor(this, floor);
	}

	public String toString() {
		return name;
	}
}
