
public class ItalianFactory extends Factory {

	@Override
	public Burger createBurger() {
		return new ItalianBurger();
	}

	@Override
	public Pasta createPasta() {
		return new ItalianPasta();
	}

}
