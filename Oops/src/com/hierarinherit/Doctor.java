package com.hierarinherit;

public class Doctor extends Person{

	public void add()
	{
		setName("Pravin");
		setAge(21);
	}
	public void display()
	{
		
		System.out.println("Doctor Name: "+getName());
		System.out.println("Doctor Age: "+getAge());
		System.out.println(this);
	}
	public static void main(String[] args) {
		Doctor d=new Doctor();
		d.add();
		d.display();
		
	}

}
