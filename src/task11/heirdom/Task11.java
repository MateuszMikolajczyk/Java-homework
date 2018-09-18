package task11.heirdom;

import task11.heirdom.part.ExhaustPart;
import task11.heirdom.part.Tire;

public class Task11 {

	public static void main(String[] args) {

		Tire tire = new Tire();
		tire.setIdNumber(22);
		tire.setWidth(20);
		ExhaustPart exhaustPart = new ExhaustPart();
		exhaustPart.setIdNumber(44);
		exhaustPart.setExhaustEmission("dsfsdf");

		System.out.println("Tire Id:" + tire.getIdNumber() + " ,Tire Width:" + tire.getWidth() + " ,Ex part Id:"
				+ exhaustPart.getIdNumber() + " ,Ex part emission:" + exhaustPart.getExhaustEmission());

	}

}
