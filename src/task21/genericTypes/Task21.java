package task21.genericTypes;

import task21.genericTypes.pair.Pair;

public class Task21 {

	public static void main(String[] args) {
	
		Pair<String, Integer> pair1 = new Pair<>("Damian",6699);
		Pair<Character, Integer> pair2 = new Pair<>('s',6699);
		
		Task21.printb(pair1);
		Task21.printb(pair2);
	}

	static<T,V> void printb(Pair<T, V> pair){
		
		System.out.println("" + pair.getT() + " " + pair.getV());
		
	}
	
}
