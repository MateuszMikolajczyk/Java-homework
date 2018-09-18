package task17.exceptions.figures;

import task17.exceptions.interfaceForCalculatingFigures.Figures;

public class Circle implements Figures {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateTheCircumference() {
		return PI * 2 * getRadius();

	}

	@Override
	public double calculateTheField() {

		return PI * getRadius() * getRadius();
	}

}
