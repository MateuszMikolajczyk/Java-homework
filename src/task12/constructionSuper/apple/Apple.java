package task12.constructionSuper.apple;

import task12.constructionSuper.fruit.Fruit;

public class Apple extends Fruit {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Apple(String name) {

		super();
		this.setName(name);

	}

	public void printInfo() {
		super.printInfo();
		System.out.print(name);
	}

}
