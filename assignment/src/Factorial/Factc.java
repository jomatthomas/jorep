package Factorial;

public class Factc extends Display{
	public void calc(int i)
	{
		int x,fact=1,n=i;
		for(x=n;x>0;x--)
		{
			fact=fact*x;
		}
		play(i,fact);
	}

}
