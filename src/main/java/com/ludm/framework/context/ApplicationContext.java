package com.ludm.framework.context;

public interface ApplicationContext {

    Object getBean(String beanName);

    void scan(String basePackage);
}
