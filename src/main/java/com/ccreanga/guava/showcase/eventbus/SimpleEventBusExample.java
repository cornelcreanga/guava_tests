package com.ccreanga.guava.showcase.eventbus;

public class SimpleEventBusExample {

    public static void main(String[] args) {
        EventBusService.getInstance().registerSubscriber(new SimpleListener());
        new Producer();


    }
}
