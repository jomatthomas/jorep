package abstractionEmployeeSalary;
public class Contractor extends Employee{
public int hour,pay,total;	
	public Contractor(int hour,int pay) {
		super("Alex","HP",22);
		this.hour=hour;
		this.pay=pay;		
	}
	
	public void calculateSalary() {				
		total=hour*pay;	
		display();
	}
	public void display() {		
		System.out.println("Employee name: "+getName());
		System.out.println("Company: "+getCompany());
		System.out.println("ID: "+getId());
		System.out.println("Total salary of Contract employee: "+total);
	}
}
	