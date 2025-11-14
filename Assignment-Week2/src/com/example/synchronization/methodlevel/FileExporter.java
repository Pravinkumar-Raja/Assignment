package com.example.synchronization.methodlevel;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class FileExporter {
	
	private final Map<String, Object> fileLocks = new HashMap<>();

    private Object getLock(String fileName) {
        synchronized (fileLocks) {
            return fileLocks.computeIfAbsent(fileName, f -> new Object());
        }
    }

    public void exportToFile(String fileName, Serializable data) {
        Object lock = getLock(fileName);

        synchronized (lock) {
            try {
                System.out.println(Thread.currentThread().getName()
                        + " writing to " + fileName);

                ObjectOutputStream oos =
                        new ObjectOutputStream(new FileOutputStream(fileName));
                oos.writeObject(data);
                oos.close();

                System.out.println(Thread.currentThread().getName()
                        + " finished " + fileName);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

	    
	    public static void main(String[] args) {

	        FileExporter exporter = new FileExporter();

	        Thread t1 = new Thread(() ->
	                exporter.exportToFile("a.ser", "Data from thread 1"),
	                "Thread-1");

	        Thread t2 = new Thread(() ->
	                exporter.exportToFile("b.ser", "Data from thread 2"),
	                "Thread-2");

	        Thread t3 = new Thread(() ->
	                exporter.exportToFile("a.ser", "Data from thread 3"),
	                "Thread-3");

	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}

