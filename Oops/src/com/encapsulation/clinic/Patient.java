package com.encapsulation.clinic;

public class Patient {

	private String name;
	private int age;
	private String disease;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + "]";
	}
}	
	
	class Main {
		public static void main(String[] args) {
			Patient m=new Patient();
			m.setName("Pravin");
			System.out.println("The name of the Patient is "+m.getName());
			m.setAge(21);
			System.out.println("The Age of the Patient is "+m.getAge());
			m.setDisease("Alzheimer");
			System.out.println("Disease that the patient "+m.getName()+ " has is "+m.getDisease());
			System.out.println(m);
		}
	}
	
	

