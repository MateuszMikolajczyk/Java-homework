package task3.taskFromVariables;

public class Task3 {

	/**
	 * @ Task from variables
	 * 
	 * Write a program in which you will declare variables that will represent a car
	 * in a car dealership by:
	 * 
	 * brand model yearbook price You can also add any fields that you think are
	 * appropriate. To represent each of the above elements, use the most
	 * appropriate type of data in your opinion.
	 * 
	 * At the end, view the information about the car that was created after you
	 * initialized the variables.
	 * 
	 */
	public static void main(String[] args) {

		String brand = "Opel";
		String model = "S4";
		int yearOfProduction = 1994;
		double price = 222.000;

		System.out.println("You bought: " + brand + " " + model + " " + yearOfProduction + " for " + price + "PLN");

	}

}
