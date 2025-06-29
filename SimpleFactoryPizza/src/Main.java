
public class Main {

	public static void main(String[] args) {
		Pizza myCheesePizza = SimplePizzaFactory.createPizza("cheese");
		myCheesePizza.prepare();
		myCheesePizza.bake();
		myCheesePizza.cut();
		myCheesePizza.box();
		
		Pizza myChickenPizza = SimplePizzaFactory.createPizza("chicken");
		myChickenPizza.prepare();
		myChickenPizza.bake();
		myChickenPizza.cut();
		myChickenPizza.box();
	}

}
