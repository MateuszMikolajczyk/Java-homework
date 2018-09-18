package task15.polymorphism.doctor;

import task15.polymorphism.person.Person;

public class Doctor extends Person {

	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Doctor(String name, String surname, int payment, int bonus) {
		super(name, surname, payment);
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "|Doctor| " + super.toString()  + " bonus:" + bonus;
	}

}
