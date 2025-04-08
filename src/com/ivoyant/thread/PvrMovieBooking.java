package com.ivoyant.thread;

public class PvrMovieBooking {
    private static ThreadLocal<String> selectedMovie = new ThreadLocal<>();

    public static void main(String[] args) {
        Runnable customer1 = () -> {
            selectedMovie.set("Googly");
            System.out.println(Thread.currentThread().getName() + " booked: " + selectedMovie.get());
        };

        Runnable customer2 = () -> {
            selectedMovie.set("Kantara");
            System.out.println(Thread.currentThread().getName() + " booked: " + selectedMovie.get());
        };

        Runnable customer3 = () -> {
            selectedMovie.set("KGF 2");
            System.out.println(Thread.currentThread().getName() + " booked: " + selectedMovie.get());
        };

        Thread t1 = new Thread(customer1, "Customer-1");
        Thread t2 = new Thread(customer2, "Customer-2");
        Thread t3 = new Thread(customer3, "Customer-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

