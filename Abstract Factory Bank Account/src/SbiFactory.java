
public class SbiFactory extends Factory {

	@Override
	public Savings createSavings() {
		return new SbiSavings();
	}

	@Override
	public Current createCurrent() {
		return new SbiCurrent();
	}

}
