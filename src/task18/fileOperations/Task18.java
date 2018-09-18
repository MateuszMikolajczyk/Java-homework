package task18.fileOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import task18.fileOperations.company.Company;
import task18.fileOperations.employee.Employee1;

public class Task18 {

	public static void main(String[] args) {

		String name;
		String surname;
		double payment;

		Company company = new Company();

		
		
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the 3 employee");

			for (int i = 0; i < 3; i++) {
				System.out.println("Name:");
				name = sc.nextLine();
				System.out.println("Surname:");
				surname = sc.nextLine();
				System.out.println("Payment:");
				payment = sc.nextDouble();
				sc.nextLine();
				company.add(new Employee1(name, surname, payment), i);
				System.out.println(company);
			}
		} catch (InputMismatchException ex) {
			ex.printStackTrace();
			System.out.println("Wrong!!!!!");
		}

		String fileName = "p.txt";

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName))) {

			os.writeObject(company);

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Saving to the file succeeded");

		System.out.println("Now we are openning the file p.txt");

		company = null;

		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName))) {

			company = (Company) is.readObject();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (company != null) {
			System.out.println(company);
		}

	}

}
