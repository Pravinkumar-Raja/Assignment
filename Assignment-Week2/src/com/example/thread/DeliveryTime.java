package com.example.thread;

public class DeliveryTime extends Thread{

	public void run()
	{
		try {
			int remaining =25;
			for(int i=0;i<5;i++)
			{
				System.out.println("Estimated Timing: "+remaining+" minutes remaining");
				Thread.sleep(5000);
				remaining-=5;
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		DeliveryTime dt=new DeliveryTime();
//		dt.start();
//	}
}
