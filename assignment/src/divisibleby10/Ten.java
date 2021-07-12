package divisibleby10;
import java.util.*;
public class Ten extends Sum{	
	public int total(int i,int j){		 
	int tot1=super.total(i,j);	
	System.out.println("Total: "+tot1);
	if(tot1%10==0)
	{
		System.out.println(tot1+" is divisible by 10");	
	}
	else
	{
		System.out.println(tot1+" is not divisible by 10");
	}
	return tot1;
	}		
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		Ten t=new Ten();
		System.out.println("Please enter two numbers");
		i=sc.nextInt();
		j=sc.nextInt();	
		t.total(i,j);
	}
}
