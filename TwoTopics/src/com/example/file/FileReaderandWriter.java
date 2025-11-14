package com.example.file;
import java.io.*;
import java.util.Scanner;

public class FileReaderandWriter {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
//	            // 1. Input from user
//	            System.out.print("Enter text to write: ");
//	            String data = sc.nextLine();
//
//	            // 2. Writing character-by-character
//	            FileWriter fw = new FileWriter("notes.txt");
//	            fw.write(data);
//	            fw.close();
//	            System.out.println("Data written to notes.txt");
//
//	            // 3. Reading character-by-character
//	            FileReader fr = new FileReader("notes.txt");
	            int ch;
//	            System.out.print("File Content: ");
	        	
	        	FileWriter fw=new FileWriter("C:\\Users\\302803\\Desktop\\B.txt");
	        	fw.write("This is Pravinkumar from UST");
	        	System.out.println("File Created Successfully");
				fw.close();
				
				FileReader fr=new FileReader("C:\\Users\\302803\\Desktop\\B.txt");
				 while ((ch = fr.read()) != -1) {
		                System.out.print((char) ch);
		            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	       
	        
	       
	        sc.close();
	    }
	}

