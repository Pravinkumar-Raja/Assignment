package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class PatientQueueSystem {
	LinkedList<String> ll=new LinkedList<String>();
	public void queue(String name)
	{
		ll.add(name);	
		
	}
	public void removeFirst(String name)
	{
		
		ll.remove(name);
		System.out.println("The queue is updated");
	}
	public void display()
	{
		System.out.println("Peoples in the queue");
		for(String st:ll)
		{
			
			System.out.println(st);
		}
	}
	
	public static void main(String[] args) {
		PatientQueueSystem pqs=new PatientQueueSystem();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of members in the queue");
		int n=s.nextInt();
		System.out.println("Enter the names");
		for(int i=0;i<n;i++)
		{
			String name=s.next();
			
			pqs.queue(name);
		}
		System.out.println("Queue number verified");
		System.out.println("Enter the patient name who completed the consulting");
		String update=s.next();
		pqs.removeFirst(update);
		pqs.display();
		
	}

}
