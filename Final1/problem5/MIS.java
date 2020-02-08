package problem5;

public class MIS  implements Graduate
{
	int fee;
	int courses;
	public MIS(int f,int c)
	{
		fee=f;
		courses=c;
	}
	//You can add your code here
	@Override
	public int getFee() {
		// TODO Auto-generated method stub
		return this.fee;
	}
	@Override
	public int getCourse() {
		// TODO Auto-generated method stub
		return this.courses;
	}
	@Override
	public int feeCal() {
		// TODO Auto-generated method stub
		return  this.fee* this.courses+1700;
	}
	
	
}
