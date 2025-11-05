package com.single.inherit;

import java.util.Scanner;

public class Doctor extends Person{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Doctor d=new Doctor();
		d.setName("Pravin");
		d.setAge(21);
		System.out.println("Name of the Doctor: "+d.getName()+", The age is: "+d.getAge());

	}

}
