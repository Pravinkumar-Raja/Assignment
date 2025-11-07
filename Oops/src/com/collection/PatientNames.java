package com.collection;

import java.util.*;

public class PatientNames {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
	    Scanner s=new Scanner(System.in);
	    String str;
	    int ch;
		do {
			System.out.println("1.Add names");
			System.out.println("2.Remove");
			System.out.println("3.View using for");
			System.out.println("4.view Usinf ForEach");
			System.out.println("5.Exit");
			System.out.println("Enter the Choice");			
			ch=s.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter the patient name");
			str=s.next();
			al.add(str);
			System.out.println("Patient "+str+" added successfully");
			break;
			case 2: System.out.println("Enter the name to remove");
			String rm=s.next();
			al.remove(rm);
			System.out.println("Patient "+rm+" removed successfully");
			break;
			case 3: for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
			break;
			case 4: for(String name:al)
			{
				System.out.println(name);
			}
			break;
			case 5: System.exit(0);
			
			}
			
			
		}while(ch!=5);
	}

}
