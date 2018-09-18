package task15.polymorphism.person;

public class Person {

	private String name;
	private String surname;
	private int payment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public Person(String name, String surname, int payment) {
		this.name = name;
		this.surname = surname;
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", payment=" + payment ;
	}

}
