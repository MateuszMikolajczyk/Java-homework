package task16.strignBuilderAndStringBuffer;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		int amount;

		Scanner sc = new Scanner(System.in);

		System.out.println("Amount of words:");
		amount = sc.nextInt();
		sc.nextLine();

		StringBuilder stringbuilder = new StringBuilder();
		String word;
		String result = "";
		int lenhthWord;
		
		for (int i = 0; i < amount; i++) {

			word = sc.nextLine();
			lenhthWord = word.length();
			stringbuilder.append(word.charAt(lenhthWord - 1));
			result = stringbuilder.toString();
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
