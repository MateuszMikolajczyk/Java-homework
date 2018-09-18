package task15.polymorphism.hospital;

import java.util.Arrays;

import task15.polymorphism.person.Person;

public class Hospital {

	public static final int MAX_EMPLOYEES = 3;

	private int numberOfEmployees;

	Person[] person;

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Hospital() {

		this.person = new Person[MAX_EMPLOYEES];
		setNumberOfEmployees(0);

	}

	public void addPerson(Person person) {

		if (getNumberOfEmployees() < MAX_EMPLOYEES) {

			this.person[numberOfEmployees] = person;
			setNumberOfEmployees(getNumberOfEmployees() + 1);

		}

	}

	@Override
	public String toString() {
		
		String result = "";
		
		for (int i=0; i<numberOfEmployees; i++) {
			result = result + person[i] + "\n";
		}
		
		return result;
	}

}
