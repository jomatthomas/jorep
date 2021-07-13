package maven_package;

import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		Excel_Read er=new Excel_Read();
		String col=er.readData(2,0);		
		System.out.println(col);
		er.readAll();
		

	}

}
