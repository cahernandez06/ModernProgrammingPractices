package Day4.Prob5;

public class SavingsAccount extends Account{
	double balance;
	double interestRate;
	String acctId;

	public SavingsAccount(String acctId,double interestRate,double startBalance) {
		this.balance=startBalance;
		this.interestRate=interestRate;
		this.acctId=acctId;
	}

	@Override
	public String getAccountId() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance+(interestRate*balance);
	}
}
