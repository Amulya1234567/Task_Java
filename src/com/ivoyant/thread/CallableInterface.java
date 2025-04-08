package com.ivoyant.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableInterface {
    static class Task implements Callable<String> {
        private int taskId;

        public Task(int id) {
            this.taskId = id;
        }

        public String call() throws Exception {
            String threadName = Thread.currentThread().getName();
            System.out.println("Task " + taskId + " started by " + threadName);
            Thread.sleep(2000);

            return "Task " + taskId + " completed by " + threadName;
        }
    }
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        // List to hold Future objects
        List<Future<String>> futureList = new ArrayList<>();

        // Submit 5 tasks and store the futures
        for (int i = 1; i <= 5; i++) {
            Future<String> future = threadPool.submit(new Task(i));
            futureList.add(future);
        }

        System.out.println("All tasks submitted.");

        // Retrieve results from the futures
        for (Future<String> future : futureList) {
            try {
                String result = future.get();  // Waits if necessary for the result
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the thread pool
        threadPool.shutdown();
    }
}

