package abstractionEmployeeSalary;

public class Total_Salary {

	public static void main(String[] args) {
		Contractor cr=new Contractor(11,200);
		FullTimeEmployee full=new FullTimeEmployee(180);
		cr.calculateSalary();	
		full.calculateSalary();
				
	}

}
