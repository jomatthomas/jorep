package salary;
public class SalarySlip extends Hra{	
	public int ded,bo,bp;
	public void slip(int bp, int ded, int bo) {	
		SalarySlip ss=new SalarySlip();
		this.bp=bp;
		this.ded=ded;
		this.bo=bo;	
		int hra,pf;
		hra=ss.hra(bp);
		pf=ss.pf(bp);
		float net=bp+hra-pf-ded+bo;
		System.out.println("Salary Slip");
		System.out.println("---------------");
		System.out.println("Basic pay:"+bp);
		System.out.println("Deductions:"+ded);
		System.out.println("HRA:"+hra);
		System.out.println("PF:"+pf);
		System.out.println("Bonus:"+bo);
		System.out.println("Net salary:"+net);	
	}	

}