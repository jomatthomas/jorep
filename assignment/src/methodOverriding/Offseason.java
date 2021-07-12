package methodOverriding;

public class Offseason {
public void discount(int op,int amount){
	int discount,net;
	discount=amount*15/100;
	System.out.println("Discount:"+discount);
	net=amount-discount;
	System.out.println("Amount after discount:"+net);
	
}
}
