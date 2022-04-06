package ru.learnUp.cycleAuto.BeanCycleAuto;

import org.springframework.context.ApplicationEvent;

public class GameEvent extends ApplicationEvent {

    private final long randomNumber;

    public GameEvent(long randomNumber) {
        super(randomNumber);
        this.randomNumber = randomNumber;
    }

    public long getRandomNumber() {
        return randomNumber;
    }

}

