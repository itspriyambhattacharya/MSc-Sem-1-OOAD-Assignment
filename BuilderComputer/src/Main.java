
public class Main {
	public static void main(String[] args) {
		Computer c = new Computer.Builder("Intel core i5 H series", "DDR5", "512GB SSD Gen 4", "Yes")
				.setCoolingSystem("No").setGraphicsCard("RTX 3050").build();
		
		Computer c1 = new Computer.Builder("Intel", "RAM", "SSD", "No").build();
		System.out.println(c);
		System.out.println(c1);
	}
}
