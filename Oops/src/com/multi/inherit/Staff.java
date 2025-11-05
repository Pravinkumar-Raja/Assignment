package com.multi.inherit;

public class Staff extends Person{

	int salPerhr=450;
	int salary=0;
	public void addDetails()
	{
		setName("Pravin");
		setAge(21);
	}
	public int calculateSal(int hrs)
	{
		
		salary=salPerhr*hrs;
		return salary;
	}
	public void display()
	{
		System.out.println("The name of the staff is "+getName());
		System.out.println("The age of the staff is "+getAge());
		System.out.println("The salary of the staff is "+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff s=new Staff();
		s.addDetails();
		s.calculateSal(8);
		s.display();

	}

}
