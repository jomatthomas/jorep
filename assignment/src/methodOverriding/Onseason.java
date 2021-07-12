package methodOverriding;
import java.util.Scanner;

public class Onseason extends Offseason{
	public void discount(int op,int amount){
		if(op==1) {
			super.discount(op, amount);
		}
		else if(op==2) {
		int discount,net;
		discount=amount*40/100;
		System.out.println("Discount:"+discount);
		net=amount-discount;
		System.out.println("Amount after discount:"+net);
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Onseason os=new Onseason();
		int op,amt;		
		System.out.println("Please select the season: 1:Offseason, 2:Onseason ");
		op=sc.nextInt();		
		System.out.println("Enter purchase amount:");
		amt=sc.nextInt();
		os.discount(op,amt);		
	}
}
