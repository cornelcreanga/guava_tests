package com.ccreanga.guava.showcase.eventbus;

public class Producer {
    public Producer() {
        EventBusService.getInstance().postEvent("cucu");
    }
}
