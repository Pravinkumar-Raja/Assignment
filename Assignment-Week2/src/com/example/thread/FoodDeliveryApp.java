package com.example.thread;

import java.util.Scanner;

public class FoodDeliveryApp {
//	public static int delivery;
//	public void run()
//	{
//		System.out.println("The thread is running");
//	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		DeliveryStatus ds=new DeliveryStatus();
		DeliveryTime dt =new DeliveryTime();
		ds.start();
		dt.start();
		
		
	}

}
