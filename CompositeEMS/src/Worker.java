
public class Worker implements Employee {

	private String name;
	private String designation;
	private int sal;

	public Worker(String name, String designation, int sal) {
		this.name = name;
		this.designation = designation;
		this.sal = sal;
	}

	@Override
	public void showDetails() {
		System.out.println("Name is " + this.name);
		System.out.println("Designation is " + this.designation);
		System.out.println("Salary is "+ calculateSalary());
	}

	@Override
	public int calculateSalary() {
		return this.sal;
	}

}
