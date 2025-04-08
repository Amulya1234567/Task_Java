package com.ivoyant.thread;

public class Volatile {
    private static volatile boolean flag = false;

    public static void main(String[] args) {

        //Waits for flag to become true
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 Waiting for flag to be true...");
            while (!flag) {
                // Will exit when flag becomes true
            }
            System.out.println("Thread1 Detected flag change to true!");
        });


        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);  // Wait for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Thread2 Flag set to true!");
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
