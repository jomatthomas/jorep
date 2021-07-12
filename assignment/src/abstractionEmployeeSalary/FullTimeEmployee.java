package abstractionEmployeeSalary;
public class FullTimeEmployee extends Employee{
	private final int HOUR=8;
	private int pay,total;	
		public FullTimeEmployee(int pay) {
		super("Amal","L&T",200);
		this.pay=pay;
	}
	
public void calculateSalary() {	
		total=pay*HOUR;	
		display();
	}

public void display() {	
	
	System.out.println("Employee name: "+getName());
	System.out.println("Company: "+getCompany());
	System.out.println("ID: "+getId());
	System.out.println("Total salary of Fulltime employee: "+total);
}

}
