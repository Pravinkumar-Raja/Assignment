package com.example.file;
import java.io.*;
import java.util.Scanner;

public class FileReaderandWriter {
public static String fileData;
public static String[] words;
	public long noof() throws IOException
	{
		long len=0;
		 try {
				BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\302803\\Desktop\\B.txt"));
				while((fileData=reader.readLine())!=null)
				{
					fileData=fileData.trim();
					words=fileData.split("\\s+");
					len+=words.length;
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return len;
	}
	    public static void main(String[] args) throws IOException {
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
	       FileReaderandWriter frw=new FileReaderandWriter();
	       long no=frw.noof();
	       System.out.println();
	       System.out.println(no);
	       
	        
	       
	        sc.close();
	    }
	}

