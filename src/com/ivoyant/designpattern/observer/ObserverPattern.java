package com.ivoyant.designpattern.observer;

public class ObserverPattern {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        Subscriber user1 = new User("Alice");
        Subscriber user2 = new User("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("Observer Design Pattern in Java");
    }
}
