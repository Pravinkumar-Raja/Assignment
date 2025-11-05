package com.hierarinherit;

public class Surgeon extends Doctor{
	static Surgeon s=new Surgeon();
	public void specialization()
	{
		System.out.println("Dr."+getName()+" is a specialized Surgeon.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon s=new Surgeon();
		s.add();
		s.display();
		((Surgeon)s).specialization();

	}

}
