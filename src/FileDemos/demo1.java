package FileDemos;

import java.io.IOException;

public class demo1 {
public static void main(String[] args) {
	System.out.println("Output Stream");
	System.err.println("Error");
	try {
		int x = System.in.read();
		System.out.println((char)x);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Error!!!!");
		e.printStackTrace();
	}
	
}
}
