package Main;

public class Job {

	private Person person;
	private int floor;

	/**
	 * default constructor, representing a call to the lobby
	 */
	public Job() {
		this.person = null;
		this.floor = 0;
	}

	/**
	 * constructor
	 * @param person
	 * @param floor
	 */
	public Job(Person person, int floor) {
		this.person = person;
		this.floor = floor;
	}

	/**
	 * tostring method
	 * @return the string
	 */
	public String toString() {
		return "job: " + person.toString() + floor;
	}

	/**
	 * gettter method for floor field
	 * @return
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * getter method for person field
	 * @return
	 */
	public Person getPerson() {
		return person;
	}
}
