package FileDemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class demo4 {
	private static final String filePath = "c:\\javaFsd\\out\\textOutput.txt";

public static void main(String[] args) {
//	testFileWriter();
	testFileReader();
	
}

private static void testFileReader() {
	// TODO Auto-generated method stub
	try {
		FileReader fr = new FileReader(filePath);
		int i =0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

private static void testFileWriter() {
	// TODO Auto-generated method stub
	try {
		FileWriter fw = new FileWriter(filePath);
		fw.write("Hey , How are you? ");
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
