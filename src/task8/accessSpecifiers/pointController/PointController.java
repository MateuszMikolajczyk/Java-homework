package task8.accessSpecifiers.pointController;

import task8.accessSpecifiers.point.Point;

public class PointController {

	public void addX(Point point) {

		int result = point.getX() + 1;
		point.setX(result);

	}

	public void subX(Point point) {

		int result = point.getX() - 1;
		point.setX(result);

	}

	public void addY(Point point) {

		int result = point.getY() + 1;
		point.setY(result);

	}

	public void subY(Point point) {

		int result = point.getY() - 1;
		point.setY(result);

	}

}
