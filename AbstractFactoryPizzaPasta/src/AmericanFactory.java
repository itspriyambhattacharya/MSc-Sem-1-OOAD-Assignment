
public class AmericanFactory extends Factory {

	@Override
	public Burger createBurger() {
		return new AmericanVegBerger();
	}

	@Override
	public Pasta createPasta() {
		return new AmericanVegPasta();
	}

}
