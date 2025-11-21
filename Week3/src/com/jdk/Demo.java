package com.jdk;

public class Demo {
	
	record Product(String name, double price) {}

	    public static void main(String[] args) {
	        Product p = new Product("Laptop", 55000.0);
	        System.out.println(p);
	    }
	}


