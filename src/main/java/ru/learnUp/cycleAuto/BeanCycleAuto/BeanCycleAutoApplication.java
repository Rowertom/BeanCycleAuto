package ru.learnUp.cycleAuto.BeanCycleAuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.Random;

@SpringBootApplication
public class BeanCycleAutoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BeanCycleAutoApplication.class, args);

		PublisherGame publisher = context.getBean(PublisherGame.class);
		publisher.publisherGame(new Random().nextInt(1000));
	}
}