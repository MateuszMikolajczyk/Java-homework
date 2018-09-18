package task17.exceptions.figures;

import task17.exceptions.interfaceForCalculatingFigures.Figures;

public class Rectangle implements Figures{

	private double length;
	private double height;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(double length, double height) {
		super();
		this.length = length;
		this.height = height;
	}

	@Override
	public double calculateTheCircumference() {
		
		return 2*getHeight() + 2*getLength();
	}

	@Override
	public double calculateTheField() {
		
		return getHeight() * getLength();
	}



}
