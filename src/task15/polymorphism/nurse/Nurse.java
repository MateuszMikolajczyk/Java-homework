package task15.polymorphism.nurse;

import task15.polymorphism.person.Person;

public class Nurse extends Person {

	private int overtime;

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public Nurse(String name, String surname, int payment, int overtime) {
		super(name, surname, payment);
		this.overtime = overtime;
	}

	
	@Override
	public String toString() {
		return "|Nurse| " + super.toString()  + " overtime:" + overtime;
	}

}
