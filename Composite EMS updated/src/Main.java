
public class Main {

	public static void main(String[] args) {
		Worker rahul = new Worker("Rahul Roy", "Jr. Developer", 12000);
		rahul.showDetails();
		System.out.println("\n");
		
		Worker ratul = new Worker("Ratul Naskar", "Jr. Developer", 10000);
		ratul.showDetails();
		System.out.println("\n");
		
		Worker rohini = new Worker("Rohini Sarkar", "Jr. Developer", 15000);
		rohini.showDetails();
		System.out.println("\n");
		
		Worker ritu = new Worker("Ritu Choufhury", "Sr. Developer", 35000);
		ritu.showDetails();
		System.out.println("\n");
		
		Worker ritaysree = new Worker("Ritaysree Sur", "Sr. Developer", 30000);
		ritaysree.showDetails();
		System.out.println("\n");
		
		Worker aritra = new Worker("Aritra Das", "Software Tester", 20000);
		aritra.showDetails();
		System.out.println("\n");
		
		Manager abhijit = new Manager("Abhijeet Guha", "IT", 50000);
		abhijit.addWorker(ratul);
		abhijit.addWorker(rohini);
		abhijit.addWorker(ritu);
		abhijit.addWorker(aritra);
		abhijit.showDetails();
		abhijit.calculateSalary();
		System.out.println("\n");
		
		Manager john = new Manager("John Doh", "Sales", 30000);
		john.addWorker(rahul);
		john.addWorker(ritaysree);
		john.addWorker(aritra);
		john.showDetails();
		System.out.println("\n");
		
		Ceo abhinav = new Ceo("Abhinav Singh", 100000);
		abhinav.addEmployee(ritaysree);
		abhinav.addEmployee(john);
		abhinav.showDetails();
	}

}
