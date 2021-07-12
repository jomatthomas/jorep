package Factorial;
import java.util.*;
public class Fact extends Factc {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Fact f = new Fact();
		int n;
		System.out.println("Enter a number:");
		n = scr.nextInt();
		f.calc(n);
	}
}
