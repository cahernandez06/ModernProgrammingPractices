package Day4.Prob4;

public abstract class Employee {
	private int empid;
	
	public Employee(int empid) {
		this.empid=empid;
	}
    public void print(PayCheck p) {
    	System.out.printf("Employee id: %s will receive a PayCheck for: %.2f\n",this.empid,p.getNetPay());
    	System.out.printf("and the taxes are: Fica: %.2f State: %.2f, Local: %.2f, Medicare: %.2f, Socialsecurity: %.2f\n\n", p.getFica(),p.getState(),p.getLocal(),p.getMedicare(),p.getSocialSecurity());
    }
    public PayCheck calcCompensation(int month, int year) {
    	PayCheck theCheck = new PayCheck(this.calGrossPay(month, year));
    	theCheck.calcTaxes();
    	return theCheck;
    }
    public abstract double calGrossPay(int month, int year);
}
