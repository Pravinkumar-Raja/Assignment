package com.example.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\302803\\Desktop\\A.txt");
			fw.write("This is PrvainKumar");
			System.out.println("File Created Successfully");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	FileReader fr = null;
		fr = new FileReader("C:\\Users\\302803\\Desktop\\A.txt");
		int i=0;
		try {
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		} catch (IOException e) {
			
			e.printStackTrace();

	
	}
}
}
