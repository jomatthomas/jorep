package encapsulation;
import java.util.*;
public class User {

public static void main(String[] args) {
	Bank b=new Bank();
	boolean p;
	b.setPin(1213);
	p=b.validate();
	if(p==true) {
		System.out.println("Pin number "+b.getPin() +" is valid");
	}
	else {
		System.out.println("Pin number "+b.getPin() +" is invalid");
	}
}

}
