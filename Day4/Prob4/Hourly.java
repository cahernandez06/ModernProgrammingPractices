package Day4.Prob4;

public class Hourly extends Employee{
	private double hourlyWage;
	private int hoursPerWeek;
	
	public Hourly(int empid, double hourlyWage,int hoursPerWeek) {
		super(empid);
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek=hoursPerWeek;
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	@Override
	public double calGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return getHourlyWage()*getHoursPerWeek()*4;
	}
	
	
    
}
