package com.example.synchronization.methodlevel;
class SaveThread implements Runnable{
	SerializablePatientRecords spr;
	SaveThread(SerializablePatientRecords spr)
	{
		this.spr=spr;
	}
	
	@Override
	public synchronized void run() {
			System.out.println("Patient 1");
			spr.savePatient();
		
	}
	

}

class PatientThread implements Runnable{
	SerializablePatientRecords spr;
	PatientThread(SerializablePatientRecords spr)
	{
		this.spr=spr;
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Patient 2");
		
		spr.savePatient();
	
		
	}

}

public class SerializablePatientRecords {
	
	public synchronized void savePatient()
	{
		System.out.println("This patient is needed to be saved");
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Patient to be saved in "+i*5);
			Thread.sleep(3000);
		}
	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		SerializablePatientRecords spr=new SerializablePatientRecords();
		Thread t1=new Thread(new SaveThread(spr));
		Thread t2=new Thread(new PatientThread(spr));
		t1.start();
		t2.start();
	}
	

}
