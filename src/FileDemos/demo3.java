package FileDemos;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo3 {
	private static final String filePath = "c:\\javaFsd\\out\\textOutput.txt";

public static void main(String[] args) {
	testOutput();

}


private static void testOutput() {
	// TODO Auto-generated method stub
	try {
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String a = "Testing buffer";
		byte[] b = a.getBytes();
		bos.write(b);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("end");
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
