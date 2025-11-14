package com.example.thread;

public class DeliveryStatus extends Thread{
	
	public void run()
	{
		try {
		for(int i=0;i<5;i++)
		{
			System.out.println("Update Delivery..."+i*20+"% completed");
			Thread.sleep(5000);
		}
		
		System.out.println("Order Delivered Successfully");
		System.out.println("Update Delivery..."+100+"% completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//	DeliveryStatus ds=new DeliveryStatus();
//	ds.start();
//	}

}
