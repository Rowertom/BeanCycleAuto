package ru.learnUp.cycleAuto.BeanCycleAuto;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;


@Component
public class BundleConfig {
    @Bean(name = "messageSource")
    @LogMethod
    @WorkTime
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("text");
        messageSource.setDefaultEncoding("windows-1251");
        return messageSource;
    }
}
