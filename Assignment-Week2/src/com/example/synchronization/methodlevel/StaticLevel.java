package com.example.synchronization.methodlevel;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ClinicConfig implements Serializable {

    // --- Static variables (Global configuration) ---
    static String hospitalName = "City Hospital";
    static String location = "Chennai";

    // --- Static synchronized serialization method ---
    public static synchronized void saveConfig() {
        try {
            System.out.println(Thread.currentThread().getName() + " started saving...");

            // Simulate delay
            Thread.sleep(2000);

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("config.ser"));
            oos.writeObject(hospitalName);
            oos.writeObject(location);
            oos.close();

            System.out.println(Thread.currentThread().getName() + " finished saving!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class StaticLevel {
	
	public static void main(String[] args) {

        // Thread 1 calling static synchronized method
        Thread t1 = new Thread(() -> {
            ClinicConfig.saveConfig();
        }, "Thread-1");

        // Thread 2 calling static synchronized method
        Thread t2 = new Thread(() -> {
            ClinicConfig.saveConfig();
        }, "Thread-2");

        t1.start();
        t2.start();
    }


}
