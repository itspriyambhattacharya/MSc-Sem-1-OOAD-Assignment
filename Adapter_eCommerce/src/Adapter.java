
public class Adapter extends BillingSystem implements AmtDollars {

	private double amt;

	public Adapter(int bill) {
		super(bill);
	}

	@Override
	public double getAmountInDollars() {
		int billAmt = getBill();
		this.amt = billAmt * 0.011;
		return this.amt;
	}

}
