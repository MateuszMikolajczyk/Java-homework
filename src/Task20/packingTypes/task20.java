package Task20.packingTypes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class task20 {

	public static void main(String[] args) {

		String nameFile = "Task20.txt";
		int a = 0;
		int b = 0;
		int c = 0;
		BigInteger bA = null;
		BigInteger bB = null;

		readFile(nameFile, a, b, c, bA, bB);
		System.out.println(a + " " + b + " " + c + " " + bA + " " + bB);

	}

	public static void readFile(String fileName, int a, int b, int c, BigInteger bA, BigInteger bB) {

		try (BufferedReader file = new BufferedReader(new FileReader(fileName))) {

			a = Integer.parseInt(file.readLine());
			b = Integer.parseInt(file.readLine());
			c = Integer.parseInt(file.readLine());
			bA = new BigInteger(file.readLine());
			bB = new BigInteger(file.readLine());

			System.out.println(a + " " + b + " " + c + " " + bA + " " + bB);
		} catch (IOException ex) {
			ex.printStackTrace();
			System.err.println("Error in reading file");
		}

	}

}
