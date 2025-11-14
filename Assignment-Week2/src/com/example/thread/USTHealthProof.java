package com.example.thread;

public class USTHealthProof implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println("The price of UST .."+i+18.5+" per second\n");
				
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

}
