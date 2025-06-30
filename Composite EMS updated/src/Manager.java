import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

	private String name;
	private String department;
	private double salary;
	private double totalSalary;
	private List<Employee> workerList = new ArrayList<>();

	public Manager(String name, String department, double sal) {
		this.name = name;
		this.department = department;
		this.salary = sal;
		this.totalSalary = this.salary;
	}

	public void addWorker(Worker w) {
		workerList.add(w);
	}

	public void removeWorker(Worker w) {
		workerList.remove(w);
	}

	@Override
	public void showDetails() {
		System.out.println("Name is " + this.name);
		System.out.println("Department is " + this.department);
		System.out.println("Salary is " + this.salary);
		System.out.print("Salary of the entire team is ");
		this.totalSalary += calculateSalary();
		System.out.println(this.totalSalary);
	}

	@Override
	public double calculateSalary() {
		double temp = 0.0;
		for (Employee e : workerList) {
			temp += e.calculateSalary();
		}
		return temp;
	}

}
