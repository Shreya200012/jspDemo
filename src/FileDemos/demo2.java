package FileDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
	private static final String filePath = "c:\\javaFsd\\out\\textOutput.txt";
public static void main(String[] args) {
//	testOutput1();
	//testOutput2();
	//testInput1();
	testInput2();
}

private static void testInput2() {
	// TODO Auto-generated method stub
	try {
		FileInputStream fis = new FileInputStream(filePath);
		int i=0;
		while ( (i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		fis.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

private static void testInput1() {
	// TODO Auto-generated method stub
	try {
		FileInputStream fis = new FileInputStream(filePath);
		int i = fis.read();
		System.out.println((char)i);
		fis.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

private static void testOutput2() {
	// TODO Auto-generated method stub
	try {
		FileOutputStream fos = new FileOutputStream(filePath);
		fos.write(67);
		fos.close();
		System.out.println("End");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

private static void testOutput1() {
	try {
		FileOutputStream fos = new FileOutputStream("filePath");
		String s = "Hello World";
		fos.write(s.getBytes());
		fos.close();
		System.out.println("End");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
