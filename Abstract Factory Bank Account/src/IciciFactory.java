
public class IciciFactory extends Factory {

	@Override
	public Savings createSavings() {
		return new IciciSavings();
	}

	@Override
	public Current createCurrent() {
		return new IciciCurrent();
	}

}
