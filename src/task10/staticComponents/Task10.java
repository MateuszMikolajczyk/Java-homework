package task10.staticComponents;

import java.util.Scanner;

import task10.staticComponents.student.Student;

public class Task10 {

	/**
	 * Create a program consisting of two classes:
	 * 
	 * Student - allows to store information about the student's name, surname and
	 * index number University - a class with the main method, in which you will
	 * create several (at least 2 students) In the Student class, define a static
	 * variable, which together with the creation of a new object of this class will
	 * be increased, and thus will allow to track the number of students at the
	 * university.
	 * 
	 * After creating at least two students in the university class, display the
	 * number of students at the university.
	 */

	public static void main(String[] args) {

		final int arrayCapacity = 1000;
		int chooseNumber;

		Student[] arrayOfStudents = new Student[arrayCapacity];
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose number which will you insert: ");
		chooseNumber = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < chooseNumber; i++) {

			String name;
			String surname;
			int idNumber;

			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Surname: ");
			surname = sc.nextLine();
			System.out.print("idNumber: ");
			idNumber = sc.nextInt();
			sc.nextLine();

			arrayOfStudents[i] = new Student(name, surname, idNumber);

			Student.numberOfStudents++;

			if (Student.numberOfStudents >= 2) {
				System.out.println("There is a " + Student.numberOfStudents + " numbers of students");
			}

		}

		sc.close();

	}

}
