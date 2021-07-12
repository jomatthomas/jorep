package aggregation;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		String name;
		int roll;
		System.out.println("Enter Name:");
		name= sc.nextLine();
		System.out.println("Enter Roll number:");
		roll=sc.nextInt();
		Address ad=new Address();
		ad.show(name,roll);
	}

}
