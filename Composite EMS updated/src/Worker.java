
public class Worker implements Employee {

	private String name;
	private double salary;
	private String designation;

	public Worker(String name, String designation, double sal) {
		this.designation = designation;
		this.salary = sal;
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println("Name is " + this.name);
		System.out.println("Designamtion is " + this.designation);
		System.out.println("Salary is " + this.salary);
	}

	@Override
	public double calculateSalary() {
		return this.salary;
	}

}
