package task8.accessSpecifiers;

import task8.accessSpecifiers.point.Point;
import task8.accessSpecifiers.pointController.PointController;

public class Task8 {

	/**
	 * @  access specifiers
	 * 
	 * Write a program that allows you to control the data of the object, which represents a point on the plane.
	 * 
	 */

	public static void main(String[] args) {

		Point point = new Point(1, 1);
		System.out.println("Point X before changes: " + point.getX());
		System.out.println("Point Y before changes: " + point.getY());

		PointController pointController = new PointController();
		pointController.addX(point);
		System.out.println("Point X after add 1: " + point.getX());
		pointController.subX(point);
		System.out.println("Point X after sub 1: " + point.getX());
		pointController.addY(point);
		System.out.println("Point Y after add 1: " + point.getY());
		pointController.subY(point);
		System.out.println("Point Y after sub 1: " + point.getY());
	}

}
