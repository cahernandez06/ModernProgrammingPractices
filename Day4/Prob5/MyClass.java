package Day4.Prob5;


public class MyClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass2 myCl2 = new MyClass2();
		System.out.println(myCl2.myMethod(10));

	}
	public interface IFace1{
		int myMethod(int x);
	}
	public interface IFace2{
		int myMethod(int x);
	}
	public class MyClass2 implements IFace1, IFace2{
		public MyClass2(){
			
		}
		public int myMethod(int x) {
			return x+1;
		}
	}
}
