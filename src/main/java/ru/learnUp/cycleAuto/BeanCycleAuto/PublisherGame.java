package ru.learnUp.cycleAuto.BeanCycleAuto;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PublisherGame implements ApplicationContextAware {
    private ApplicationContext context;

    @LogMethod
    @WorkTime
    public void publisherGame(int number) {
        context.publishEvent(new GameEvent(number));

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}

