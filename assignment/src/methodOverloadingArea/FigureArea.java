package methodOverloadingArea;
import java.util.*;
public class FigureArea {
float area;
	public void area(int r,float pi) {
		area=pi*r*r;
		System.out.println("Area of circle: "+area);
	}
	public void area(int a,int b) {
		area=a*b;
		System.out.println("Area of rectangle: "+area);
	}
	public void area(int s) {
		area=s*s;
		System.out.println("Area of square: "+area);
	}

	public static void main(String[] args) {
		char op;
		int r,l,w,a;
		float pi=3.14F;
		FigureArea fa=new FigureArea();
		Scanner sc=new Scanner(System.in);	
		System.out.println("C-circle, R-rectangle, S-square");
		System.out.println("Please select any option to find area:");
		op=sc.next().charAt(0);
		if(op=='C') {
			System.out.println("Enter the radius of circle:");
			r=sc.nextInt();
			fa.area(r,pi);
		}
		else if(op=='R'){
			System.out.println("Enter the length:");
			l=sc.nextInt();
			System.out.println("Enter the width:");
			w=sc.nextInt();
			fa.area(l,w);
		}
		else if (op=='S'){
			System.out.println("Enter the side length of square:");
			a=sc.nextInt();
			fa.area(a);
		}
		else {
			System.out.println("Invaild input");
		}
	

	}

}
