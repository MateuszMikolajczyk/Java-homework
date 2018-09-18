package task5.objectsAndClasses;

public class Task5 {

	/**
	 * @ objects and classes
	 * 
	 * 
	 * Write a program in which you will create two classes:
	 * 
	 * Employee - a class that will represent an employee of any company. Basic
	 * information about the employee what the employer needs is the name, surname,
	 * year of birth, job seniority Company - a class in which you create 3 objects
	 * representing employees, and then display information about them on the screen
	 * 
	 */

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.name = "Jan";
		employee1.surname = "Machowski";
		employee1.dateOfBirth = "04.02.1993";
		employee1.seniority = 4;

		String employee1String = "Name: " + employee1.name + "\n" + "Surname: " + employee1.surname + "\n"
				+ "Date of birth: " + employee1.dateOfBirth + "\n" + "Seniority: " + employee1.seniority + "\n";

		Employee employee2 = new Employee();
		employee2.name = "Damian";
		employee2.surname = "Machowski";
		employee2.dateOfBirth = "04.12.1992";
		employee2.seniority = 2;

		String employee2String = "Name: " + employee2.name + "\n" + "Surname: " + employee2.surname + "\n"
				+ "Date of birth: " + employee2.dateOfBirth + "\n" + "Seniority: " + employee2.seniority + "\n";

		System.out.println("Employee 1" + "\n" + employee1String + "Employee 2" + "\n" + employee2String);

	}

}
