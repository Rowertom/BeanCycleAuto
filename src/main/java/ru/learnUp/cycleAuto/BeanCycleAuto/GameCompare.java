package ru.learnUp.cycleAuto.BeanCycleAuto;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Scanner;

@Component
public class GameCompare implements ApplicationListener<GameEvent>, ApplicationContextAware  {
    ApplicationContext context;

    public void onApplicationEvent(GameEvent event) {
        System.out.println(context.getMessage("hello", null,Locale.getDefault()));
        System.out.println(context.getMessage("tryInput", null, Locale.getDefault()));
        Scanner sc = new Scanner(System.in);
        long enterNumber = sc.nextInt();
        while (enterNumber != event.getRandomNumber()) {
            if (enterNumber > event.getRandomNumber()) {
                System.out.println(context.getMessage("lower", null, Locale.getDefault()));
            } else {
                System.out.println(context.getMessage("higher", null, Locale.getDefault()));
            }
            enterNumber = sc.nextInt();
        }
        System.out.println(context.getMessage("congrats", null, Locale.getDefault()) + event.getRandomNumber());
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

}
