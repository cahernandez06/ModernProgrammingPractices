package Day13.Exer7_2;

public enum CompanyVals {
	ORACLE("Oracle",50000000), MICROSOFT("Microsoft",20000000), GOOGLE("Google",40000000);
	
	public String companyName;
	public double salesTarget;
	
	CompanyVals(String cName, double sTarget){
		companyName=cName;
		salesTarget=sTarget;
	}

}
