package Main;

public class Floor {

	private Person[]people; //person objects that are currently on the flooor
	private int numFloor;

	/**
	 * constructor
	 * @param floor
	 */
	public Floor(int floor) {
		people = new Person[0];
		numFloor = floor;
	}

	/**
	 * This method should
	 * save a reference of the Person within this Floor object
	 * @param person
	 */
	public void enterFloor(Person person) {
		Person[]newPpl = new Person[people.length+1];
		newPpl[people.length] = person;
		if(people.length > 0) {
			for(int i =0; i < people.length;i++) {
				newPpl[i] = people[i];
			}
		}
		people = newPpl;
	}

	/**
	 * getter method for Floor field
	 * @return floor number
	 */
	public int getFloor() {
		return numFloor;
	}

	/**
	 * getter method for array list's length
	 * @return length of the array
	 */
	public int getPeople() {
		return people.length;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return "floor: " + numFloor;
	}
}
