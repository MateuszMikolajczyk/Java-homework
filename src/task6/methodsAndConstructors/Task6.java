package task6.methodsAndConstructors;

public class Task6 {

	/**
	 * 
	 * @ methods and constructors
	 * 
	 * simple calculator
	 * 
	 */

	public static void main(String[] args) {

		double x = 2.5;
		double y = 3.4;

		Calculator calculator = new Calculator();

		System.out.println("Add:" + calculator.add(x, y) + ", Sub:" + calculator.substract(x, y) + ", Multiply:"
				+ calculator.multyply(x, y) + ", Div:" + calculator.divide(x, y));
	}
}
