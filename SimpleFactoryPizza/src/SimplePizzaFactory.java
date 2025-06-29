
public class SimplePizzaFactory {
	public static Pizza createPizza(String type) {
		if(type.equalsIgnoreCase("Cheese")) {
			return new CheesePizza();
		}
		else if(type.equalsIgnoreCase("Chicken")) {
			return new ChickenPizza();
		}
		return null;
	}
}
