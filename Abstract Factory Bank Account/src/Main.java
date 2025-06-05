
public class Main {

	public static void main(String[] args) {
		Factory f1 = new SbiFactory();
		Factory f2 = new IciciFactory();
		Savings ss = f1.createSavings();
		ss.savings();
		Current sc = f1.createCurrent();
		sc.current();
		
		ss = f2.createSavings();
		ss.savings();
		sc = f2.createCurrent();
		sc.current();
	}

}
