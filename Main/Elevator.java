package Main;

public class Elevator {

	/**
	 * This specifies the number of people that can be brought to their floors by an Elevator
	 * instance at any given time.
	 * <p>DO NOT REMOVE THIS FIELD</p>
	 * <p>You may edit it. But keep it public.</p>
	 */
	protected static int maxOccupants = 3;
	private Job[] jobs = new Job[0]; //an array of jobs
	private  int currentFloor = 0;
	Building building;

	/**
	 * constructor
	 * @param building
	 */
	public Elevator(Building building) {
		this.building = building;
	}

	/**
	 *This method should add a new job to be completed by this Elevator given a Person and
	 *their desired floor number.
	 * @param person
	 * @param floor
	 */
	public void createJob(Person person, int floor) {
		Job j = new Job(person, floor);
		Job[] newJobs = new Job[jobs.length+ 1];
		newJobs[jobs.length] = j;
		if(jobs.length > 0) {
			for(int i =0; i < jobs.length; i++) {
				newJobs[i] = jobs[i];
			}
		}
		jobs= newJobs;
	}

	/**
	 * getter method for checking length of jobs array
	 * @return length of the array
	 */
	public int getJobs() {
		return jobs.length;
	}

	/**
	 * This method should remove jobs
	 * one by one and process them.
	 */
	public void processAllJobs() {
		int num = maxOccupants;
		while(jobs.length % 3 != jobs.length) {
			for(int i = 0; i < num; i ++) {
				processJob(jobs[0]);
			}
			currentFloor = 0;
			System.out.println("Elevator at Lobby");
		}
		if(jobs.length < num) {
			for(int j = 0; j <= jobs.length; j++) {
				processJob(jobs[0]);
				j =0;
			}
			currentFloor = 0;
		}
	}

	/**
	 * This method should process a
	 * Job. This will involve moving this Elevator from its current floor to the Floor
	 * indicated by the provided Job
	 * @param job
	 */
	public void processJob(Job job) {
		if(currentFloor == 0) {
			System.out.println("Elevator at Lobby");
		} else {
			System.out.println("Elevator at floor " + currentFloor);
		}
		if(job.getFloor() > currentFloor) {
			for(int i = currentFloor + 1; i <= job.getFloor(); i++) {
				System.out.println("Elevator at floor " + i );
			}
		} else {
			for(int i = currentFloor - 1; i >= job.getFloor(); i--) {
				System.out.println("Elevator at floor " + i);
			}
		}
		currentFloor = job.getFloor();
		exit(job.getPerson(), job.getFloor());
	}

	/**
	 *This method
	 *should remove a Person from this Elevator onto their Floor in the Building the
	 *Person is in
	 * @param person
	 * @param floor
	 */
	public void exit(Person person, int floor) {
		person.setLocation(floor);
		person.setStatus(2);
		building.enterFloor(person, floor);
		Job[] newJobs2;
		if(jobs.length == 1) {
			newJobs2 = new Job[0];
			jobs = newJobs2;
		} else if(jobs.length >1) {
			newJobs2 = new Job[jobs.length-1];
			for(int i = 1; i < jobs.length; i++) {
				newJobs2[i-1] = jobs[i];
			}
			jobs = newJobs2;
		}
	}

}
