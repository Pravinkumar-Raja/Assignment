package com.example.thread;

public class PASolutions implements Runnable{

	@Override
	public void run() {
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println("The price of PA Soltutions.."+i+12.5+" per seconds\n");
			
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}

}
