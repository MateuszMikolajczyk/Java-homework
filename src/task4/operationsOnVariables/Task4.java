package task4.operationsOnVariables;

import java.util.Random;

/**
 * 
 * @author operations on variables
 *
 *         Write a program in which you declare two int variables with the names
 *         x and y. Assign a random one to them, and then use logical and
 *         mathematical operators
 */

public class Task4 {

	public static void main(String[] args) {

		int x = new Random().nextInt(10);
		int y = new Random().nextInt(10);
		boolean result;

		System.out.println("My numbers are x=" + x + " y=" + y);

		result = x > y;
		System.out.println("x>y " + result);

		result = x * 2 > y;
		System.out.println("x*2 > y " + result);

		result = (x + 3 > y && x - 2 < y);
		System.out.println("x+3 > y && x-2 < y " + result);

		result = (x * y) % 2 == 0;
		System.out.println("(x*y)%2 " + result);

	}
}