package com.hierarinherit;

public class Dentist extends Doctor{
	public void specialization()
	{
		System.out.println("Dr."+getName()+" is a specialized Dentist.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dentist d=new Dentist();
		d.add();
		d.display();
		d.specialization();

	}

}
