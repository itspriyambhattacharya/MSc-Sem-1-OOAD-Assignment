
public class Main {

	public static void main(String[] args) {
		Adapter a = new Adapter(2000);
		double res = a.getAmountInDollars();
		System.out.println("The amount in dollars is "+ res);
	}

}
