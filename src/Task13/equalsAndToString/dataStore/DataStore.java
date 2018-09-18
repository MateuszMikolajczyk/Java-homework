package Task13.equalsAndToString.dataStore;

import Task13.equalsAndToString.computer.Computer;

public class DataStore {

	public static final int MAX_COMPUTERS = 100;
	private Computer[] amountOfComputers;
	private int computerNumber;

	public Computer[] getAmountOfComputers() {
		Computer[] comp = new Computer[computerNumber];
		for(int i=0; i<computerNumber; i++) {
			comp[i] = amountOfComputers[i];
		}
		return comp;
	}

	public void setAmountOfComputers(Computer[] amountOfComputers) {
		this.amountOfComputers = amountOfComputers;
	}

	public int getComputerNumber() {
		return computerNumber;
	}

	public void setComputerNumber(int computerNumber) {
		this.computerNumber = computerNumber;
	}

	public DataStore() {
		amountOfComputers = new Computer[MAX_COMPUTERS];
		computerNumber = 0;
	}

	public void add(Computer comp) {
		if(computerNumber < MAX_COMPUTERS) {
			amountOfComputers[computerNumber] = comp;
			computerNumber++;
		}
	}
	
	public int checkAvailability(Computer find) {
		if (find == null)
			return 0;

		int count = 0;
		for (int i = 0; i < computerNumber; i++) {
			if (find.equals(amountOfComputers[i])) {
				count++;
			}
		}
		return count;
	}
	
}
