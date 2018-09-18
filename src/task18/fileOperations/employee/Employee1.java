package task18.fileOperations.employee;

import task18.fileOperations.abstractPerson.Person;

public class Employee1 extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5670231238240789784L;
	private double payment;

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public Employee1(String name, String surname, double payment1) {
		super(name, surname);
		this.payment = payment1;
	}

	@Override
	public String toString() {
		return super.toString() + " ,payment=" + payment ;
	}

	
}
