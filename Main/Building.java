package Main;
/**
 * Building class
 * A Building will have a lobby and then floors numbered 1, 2, up to some maximum.
 * known bugs: none
 *
 * @author cindy hou

 */
public class Building {
	Floor[] floors; //Array of floors
	Elevator elevator; //an elevator

	/**
	 * This constructs a Building that has some number of floors.
	 * @param numFloors
	 */
	public Building(int numFloors) {
		floors = new Floor[numFloors];
		for(int i = 0; i < floors.length; i++) {
			floors[i] = new Floor(i);

		}
		elevator = new Elevator(this);
	}

	/**
	 * This method will handle the request made by a Person to enter
	 *  this Building and be taken to some floor.
	 * @param person
	 * @param floor
	 * @return false If the Elevator cannot
	 * reach the Person’s desired floor
	 */
	public boolean enterElevatorRequest(Person person, int floor) {
		if(floor > floors.length) {
			return false;
		} else {

			elevator.createJob(person, floor);
		}
		return true;
	}

	/*
	 * This will call a method in this
	 * Building’s Elevator instance that should process all of its current Jobs
	 */
	public void startElevator() {
		elevator.processAllJobs();
	}

	/**
	 * This method should save a reference of a Person in the Floor with the provided floor
	 * number
	 * @param person
	 * @param floor
	 */
	public void enterFloor(Person person, int floor) {
		floors[floor-1].enterFloor(person);
	}

	/**
	 * getter method for field elevator
	 * @return field elevator
	 */
	public Elevator getElevator() {
		return this.elevator;
	}

	/**
	 * getter method for field floors
	 * @return
	 */
	public int getFloors() {
		return floors.length;
	}

	/**
	 * getter method for floors array
	 * @return floors array
	 */
	public Floor[] getArray() {
		return this.floors;
	}
}
