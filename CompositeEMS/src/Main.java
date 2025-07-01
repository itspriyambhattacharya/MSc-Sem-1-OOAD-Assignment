
public class Main {
	public static void main(String[] args) {
		// creating worker objects
		Worker rohan = new Worker("Rohan", "Jr. Developer", 1000);
		Worker soham = new Worker("Soham", "Jr. Developer", 2000);
		Worker rina = new Worker("Rina", "Sr. Developer", 4000);
		Worker tiya = new Worker("Tiya", "Sr. Developer", 4000);
		Manager abhishek = new Manager("Abhishek", "IT Department", 8000);
		Worker rohit = new Worker("Rohit", "Tester", 5000);

		// add workers under manager
		abhishek.addEmployee(rohit);
		abhishek.addEmployee(tiya);
		abhishek.addEmployee(rohan);

		rohan.showDetails();
		abhishek.showDetails();
		
		Manager sima = new Manager("Sima", "Sales Department", 10000);
		sima.addEmployee(rina);
		sima.showDetails();
	}
}
