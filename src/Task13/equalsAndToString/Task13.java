package Task13.equalsAndToString;

import Task13.equalsAndToString.computer.Computer;
import Task13.equalsAndToString.dataStore.DataStore;

public class Task13 {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer("Dell", 22);
		DataStore dataStore = new DataStore();
		
		dataStore.add(new Computer("Dell", 11));
		dataStore.add(new Computer("Dell", 22));
		
		int amountOfTheSameComputers = dataStore.checkAvailability(computer1);
		System.out.println("Amount of computers: " + computer1 + " is " + amountOfTheSameComputers);
		
		System.out.println("All computers: ");
		for(Computer c: dataStore.getAmountOfComputers()) {
			System.out.println(c);
		}
	}
	
}
