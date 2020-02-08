package Day4.Prob4;

public final class PayCheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	
	private final double FICA=0.23;
	private final double STATE=0.05;
	private final double LOCAL=0.01;
	private final double MEDICARE=0.03;
	private final double SOCIALSEC=0.075;
	
	public void calcTaxes() {
		this.fica = grossPay*FICA;
		this.state = grossPay*STATE;
		this.local = grossPay*LOCAL;
		this.medicare = grossPay*MEDICARE;
		this.socialSecurity = grossPay*SOCIALSEC;
	}
	public PayCheck(double grossPay) {
		this.grossPay=grossPay;
	}
	public void print() {
    	System.out.printf("Employee id: s will receive a PayCheck for: %.2f\n",getNetPay());
    	System.out.printf("and the taxes are: Fica: %.2f State: %.2f, Local: %.2f, Medicare: %.2f, Socialsecurity: %.2f\n\n", getFica(),getState(),getLocal(),getMedicare(),getSocialSecurity());
	}
	public double getNetPay() {
		return grossPay-fica-state-local-medicare-socialSecurity;
	}
	public double getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
	public double getFica() {
		return fica;
	}
	public double getState() {
		return state;
	}
	public double getLocal() {
		return local;
	}
	public double getMedicare() {
		return medicare;
	}
	public double getSocialSecurity() {
		return socialSecurity;
	}
}
