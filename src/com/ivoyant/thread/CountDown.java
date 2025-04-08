package com.ivoyant.thread;

import java.util.concurrent.CountDownLatch;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3); // wait for 3 threads

        for (int i = 1; i <= 3; i++) {
            final int threadId = i;
            new Thread(() -> {
                System.out.println("Thread " + threadId + " started.");
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread " + threadId + " finished.");
                latch.countDown(); // Reduce the latch count
            }).start();
        }

        System.out.println("Main thread waiting for workers...");
        latch.await(); // Wait until count = 0
        System.out.println("All workers finished. Main thread continues.");
    }
}

