package com.example.thread;


class FileDownloader extends Thread {
    private int chunkNumber;

    public FileDownloader(int chunkNumber) {
        this.chunkNumber = chunkNumber;
    }

    @Override
    public void run() {
        try {
            System.out.println("Downloading chunk " + chunkNumber + "...");
            Thread.sleep(2000); 
            System.out.println("chunk " + chunkNumber + " downloaded!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Downloader {

	    public static void main(String[] args) {
	        System.out.println("Starting download...\n");

	        // Create multiple downloader threads
	        FileDownloader t1 = new FileDownloader(1);
	        FileDownloader t2 = new FileDownloader(2);
	        FileDownloader t3 = new FileDownloader(3);

	        // Start all threads
	        t1.start();
	        t2.start();
	        t3.start();

	        try {
	            // Wait for all threads to complete
	            t1.join();
	            t2.join();
	            t3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // All chunks done
	        System.out.println("\nDownload complete!");
	    }
	}

