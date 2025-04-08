package com.ivoyant.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // only 2 permits

        for (int i = 1; i <= 5; i++) {
            final int threadId = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + threadId + " waiting for permit");
                    semaphore.acquire(); // try to get a permit
                    System.out.println("Thread " + threadId + " got permit and is working");
                    Thread.sleep(2000); // simulate work
                    System.out.println("Thread " + threadId + " releasing permit");
                    semaphore.release(); // release permit
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

