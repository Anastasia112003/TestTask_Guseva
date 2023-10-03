package com.example.testtask_guseva;

import java.util.concurrent.atomic.AtomicInteger;

class ActionCounter {
    private final AtomicInteger counter;
    private int result;

    public ActionCounter(AtomicInteger counter) {
        this.counter = counter;
    }

    public void call(int timestamp) {
        while (timestamp != 0) {
            counter.incrementAndGet();
        }
    }

    public int getActions(int timestamp) {
        if (timestamp > 300) {
            result = counter.decrementAndGet();
        }
        return result;


    }
}
