package task14.enumTask.pizza;

public enum Pizza {

	MARGHRTITA(true, true, false, false), CAPRICIOSA(true, true, true, false), PROSCIUTO(true, true, false, true);

	private boolean cheese;
	private boolean sauce;
	private boolean mushrooms;
	private boolean ham;

	public boolean getCheese() {
		return cheese;
	}

	public boolean getSauce() {
		return sauce;
	}

	public boolean getMushrooms() {
		return mushrooms;
	}

	public boolean getHam() {
		return ham;
	}

	private Pizza(boolean cheese, boolean sauce, boolean mushrooms, boolean ham) {
		this.cheese = cheese;
		this.sauce = sauce;
		this.mushrooms = mushrooms;
		this.ham = ham;
	}

	@Override
	public String toString() {
		String result = this.name() + "(";

		if (cheese) {
			result = result + "cheese";
		}
		if (sauce) {
			result = result + ", sauce";
		}
		if (mushrooms) {
			result = result + ", mushroms";
		}
		if (ham) {
			result = result + ", ham";
		}
		result = result + ")";

		return result;
	}

}
