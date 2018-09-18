package task7.overloadingMethods;

public class Task7 {

	/**
	 * @  overloading methods
	 *
	 */
	
	public static void main(String[] args) {

		double x = 2.5;
		double y = 3.4;
		double z = 3.4;

		Calculator2 calculator = new Calculator2();

		System.out.println("Add(with 2 arguments):" + calculator.add(x, y) + ", Add(with 3 arguments):"
				+ calculator.add(x, y, z) + ", Sub:" + calculator.substract(x, y));
	}

}
