package task17.exceptions.calculator;

import task17.exceptions.interfaceForCalculatingFigures.Figures;

public class Calculator {

	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Calculator() {

	}

	public Calculator(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double add(double x, double y) {

		return x + y;
	}

	public double sub(double x, double y) {

		return x - y;
	}

	public double multiply(double x, double y) {

		return x * y;
	}

	public double div(double x, double y) throws ArithmeticException {

		if (y == 0) {
			throw new ArithmeticException("do not divide by zero");
		}

		return x / y;

	}

}
