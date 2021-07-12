package average;

public class AverageNumber {

	public void average(int a,int b,int c) {
		int avi=(a+b+c)/3;
		System.out.println("Average of integer numbers "+a+","+b+","+c+" is "+avi);		
	}
	public void average(float a,float b, float c) {
		float avf=(a+b+c)/3;
		System.out.println("Average of float numbers "+a+" , "+b+" , "+c+" is "+avf);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageNumber an=new AverageNumber();
		an.average(91,42,77);
		an.average(22.4f,51.74f,34.55f);

	}

}
