import java.util.ArrayList;
import java.util.List;

public class Ceo implements Employee {
	private String name;
	private double salary;
	private double totalSalary;
	private List<Employee> employeeList = new ArrayList<>();

	public Ceo(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.totalSalary = this.salary;
	}

	public void addEmployee(Employee e) {
		employeeList.add(e);
	}

	public void removeEmployee(Employee e) {
		employeeList.remove(e);
	}

	@Override
	public void showDetails() {
		System.out.println("Name is " + this.name);
		System.out.println("Salary is " + this.salary);
		this.totalSalary += calculateSalary();
		System.out.print("The total salary of " + this.name + " is " + this.totalSalary);
	}

	@Override
	public double calculateSalary() {
		double temp = 0.0;

		for (Employee e : employeeList) {
			temp += e.calculateSalary();
		}
		return temp;
	}

}
