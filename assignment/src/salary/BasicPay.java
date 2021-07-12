package salary;
import java.util.*;
public class BasicPay extends SalarySlip{
	public void get() {
		int bp,ded,bo;
		BasicPay bps=new BasicPay();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your salary details:");		
		System.out.println("Basic pay:");
		bp=sc.nextInt();
		System.out.println("Deductions:");
		ded=sc.nextInt();
		System.out.println("Bonus:");
		bo=sc.nextInt();
		bps.slip(bp,ded,bo);
	}

public static void main(String[] args) {
	BasicPay bp=new BasicPay();
	bp.get();	
}
}
