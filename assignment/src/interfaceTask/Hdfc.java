package interfaceTask;

public class Hdfc implements rbi{
	public int months,amount;
	private float total,interest,totalInterest=0;	
	
	public void recurringDeposit(int amount,int months) {		
		this.amount=amount;
		this.months=months;
		float amt=amount;
		for(int i=1;i<=months;i++) {				
		interest=amt*1/12*rbi.interest/100;	
		totalInterest+=interest;
		total=amt+interest;
		amt=amount+total;
		}
		
		System.out.println("Total maturity amount for Rs."+amount+" per month for "+months+" months @"+rbi.interest+"% interest:"+total);
		System.out.println("Total Interest: "+totalInterest);
	}
	public static void main(String[] args) {
		Hdfc hd=new Hdfc();
		hd.recurringDeposit(1500,25);

	}
}
