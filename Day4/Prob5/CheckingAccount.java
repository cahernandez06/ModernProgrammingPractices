package Day4.Prob5;

public class CheckingAccount extends Account{
	double balance;
	double monthlyFee;
	String acctId;
	
	public CheckingAccount(String acctId,double fee,double startBalance) {
		this.balance=startBalance;
		this.monthlyFee=fee;
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
		return balance-monthlyFee;
	}

}
