package task14.enumTask;

import java.util.Scanner;

import task14.enumTask.pizza.Pizza;

public class Task14 {

	public static void main(String[] args) {
		
		System.out.println("All of pizzas");
		for (Pizza p : Pizza.values()) {
			System.out.println(p);
		}
		
		Scanner sc = new Scanner(System.in);
		String choose;
		System.out.println("choose the one pizza");
		choose = sc.nextLine();
		System.out.println(Pizza.valueOf(choose));
	
		sc.close();
				
	}

}
