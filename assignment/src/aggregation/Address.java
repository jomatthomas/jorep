package aggregation;
import java.util.*;

public class Address {	
	public String address;
	
	public void show(String name,int roll) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Address:");		
		address= sc.nextLine();
		Address ad=new Address();
		ad.display(roll,name,address);
	}
	
	public void display(int roll,String name, String add) {
			System.out.println("Roll No:"+roll);		
			System.out.println("Name:"+name);
			System.out.println("Address:"+add);
		}
}
