
public class Main {
	public static void main(String[] args) {
		Factory f = new ItalianFactory();
		Burger italianBurger = f.createBurger();
		italianBurger.prepare();
		
		Pasta italianPasta = f.createPasta();
		italianPasta.cook();
		
		f = new AmericanFactory();
		
		Burger americanBurger = f.createBurger();
		americanBurger.prepare();
		
		Pasta americanPasta = f.createPasta();
		americanPasta.cook();
	}
}

