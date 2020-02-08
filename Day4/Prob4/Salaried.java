package Day4.Prob4;

public class Salaried extends Employee{
	private double salary;

	public Salaried(int empid, double salary) {
		super(empid);
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return getSalary();
	}
	
	

}
