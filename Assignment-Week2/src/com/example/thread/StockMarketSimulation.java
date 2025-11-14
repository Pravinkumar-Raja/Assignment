package com.example.thread;

public class StockMarketSimulation {
	public static void main(String[] args) {
		PASolutions pas=new PASolutions();
		Thread t1=new Thread(pas);
		USTHealthProof ust=new USTHealthProof();
		Thread t2=new Thread(ust);
		t1.start();
		t2.start();
	}
	

}
