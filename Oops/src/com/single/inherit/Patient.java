package com.single.inherit;

public class Patient extends Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient();
		p.setName("Kumar");
		p.setAge(25);
		System.out.println("Name of the Patient: "+p.getName()+", The age is: "+p.getAge());

	}

}
