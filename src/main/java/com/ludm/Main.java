package com.ludm;

import com.ludm.configuration.TestConfiguration;
import com.ludm.framework.context.AnnotationConfigApplicationContext;
import com.ludm.framework.context.ApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.scan("com.ludm.service");
        Object testService = applicationContext.getBean("testService");
        System.out.println(testService);
    }
}
