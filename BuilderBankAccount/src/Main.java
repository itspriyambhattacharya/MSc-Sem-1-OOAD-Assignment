
public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount.Builder("3947080567", "Priyam Bhattacharya").setbranch("Sakher Bazar").build();

		System.out.println(ba);
	}

}
