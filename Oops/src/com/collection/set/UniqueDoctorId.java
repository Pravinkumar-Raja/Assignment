package com.collection.set;
import java.util.*;
public class UniqueDoctorId {
	
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total doctors");
		int n=s.nextInt();
		System.out.println("Enter the Dotor id's");
		for(int i=0;i<n;i++)
		{
			int id=s.nextInt();
			h.add(id);
		}
		System.out.println("Displaying the unique id's");
		for(int i:h)
		{
			System.out.println(i);
		}
	}

}
