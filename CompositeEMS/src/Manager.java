import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private String department;
	private int sal;
	private int totalSalary;
	private List<Worker> wList = new ArrayList<>();

	public Manager(String name, String department, int sal) {
		this.name = name;
		this.sal = sal;
		this.department = department;
		this.totalSalary = this.sal;
	}

	public void addEmployee(Worker w) {
		wList.add(w);
	}

	public void removeEmployee(Worker w) {
		wList.remove(w);
	}

	@Override
	public void showDetails() {
		System.out.println("Name is " + this.name);
		System.out.println("Department is " + this.department);
		System.out.println("Salary of " + this.name + " is " + this.sal);
		System.out.println("Workers under " + this.name);
		for (Worker i : wList) {
			i.showDetails();
		}
		System.out.println("Total salary of the team is " + calculateSalary());

	}

	@Override
	public int calculateSalary() {
		for (Worker w : wList) {
			this.totalSalary += w.calculateSalary();
		}
		return this.totalSalary;
	}

}
