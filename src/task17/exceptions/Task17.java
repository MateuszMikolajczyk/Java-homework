package task17.exceptions;



import java.util.InputMismatchException;
import java.util.Scanner;

import task17.exceptions.calculator.Calculator;
import task17.exceptions.figures.Circle;
import task17.exceptions.figures.Rectangle;
import task17.exceptions.interfaceForCalculatingFigures.Figures;
import task17.exceptions.unkownOperatorException.UnkownOperatorException;

public class Task17 {

	public static void main(String[] args) throws UnkownOperatorException {

		boolean error = true;
		String option = "";
		double numberX = 0.0;
		double numberY = 0.0;
		Calculator calculator = null;
		Figures rectangle = null;
		Figures circle = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("insert the number");

		while (error) {

			try {
				numberX = sc.nextDouble();
				sc.nextLine();
				numberY = sc.nextDouble();
				sc.nextLine();
				error = false;
			} catch (InputMismatchException ex) {
				ex.printStackTrace();
				System.out.println("Please enter only the Floating point numbers");
				sc.nextLine();

			}
			calculator = new Calculator(numberX, numberY);
		}

		error = true;

		while (error) {

			System.out.println(
					"choose the option: + , - , * , / , (1) calculations for the circle , (2) calculations for the rectangle , End");
			option = sc.nextLine();

			switch (option) {

			case "+":
				System.out.println(calculator.add(calculator.getX(), calculator.getY()));
				break;
			case "-":
				System.out.println(calculator.sub(calculator.getX(), calculator.getY()));
				break;
			case "*":
				System.out.println(calculator.multiply(calculator.getX(), calculator.getY()));
				break;
			case "/":
				System.out.println(calculator.div(calculator.getX(), calculator.getY()));
				break;
			case "1":
				circle = new Circle(2);
				System.out.println("when the radius is equal 2 then the field is equal " + circle.calculateTheField());
				System.out.println("when the radius is equal 2 then the Circumference is equal " + circle.calculateTheCircumference());
				break;
			case "2":
				rectangle = new Rectangle(2.2, 4.5);
				System.out.println("when the length is equal 2.2 and height is equal 4.5 then the field is equal " + rectangle.calculateTheField());
				System.out.println("when the length is equal 2.2 and height is equal 4.5 then the Circumference is equal " + rectangle.calculateTheCircumference());
				break;
			case "End":
				System.out.println("Good bye!!!");
				error = false;
				break;
			default:
				throw new UnkownOperatorException("Wrong optionon!!!!!");
			}
		}
		
		sc.close();
	}

}
