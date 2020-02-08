package Day3.Ex1;

public class PersonWithJob {
	
	private double salary;
	private Person per;
	
	public double getSalary() {
		return salary;
	}
	
	PersonWithJob(String n, double s) {
		per=new Person(n);
		salary = s;
	}
	
	public Person getPerson() {
		return per;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		//if(!(aPerson instanceof PersonWithJob)) return false;
		if(aPerson.getClass()!=getClass()) return per.equals(aPerson);
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = per.getName().equals(p.getPerson().getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
