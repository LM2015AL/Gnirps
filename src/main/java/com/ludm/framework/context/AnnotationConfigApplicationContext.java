package com.ludm.framework.context;

import com.ludm.configuration.TestConfiguration;
import com.ludm.framework.bean.factory.annotation.AnnotatedGenericBeanDefinition;
import com.ludm.framework.bean.factory.config.BeanDefinition;
import com.ludm.framework.context.annotation.ComponentScan;
import com.ludm.framework.context.annotation.Lazy;
import com.ludm.framework.context.annotation.Scope;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnnotationConfigApplicationContext implements ApplicationContext {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    private Map<String, Object> singletonObject = new ConcurrentHashMap<>();

    private ClassLoader classLoader = this.getClass().getClassLoader();

    public AnnotationConfigApplicationContext() {
    }

    @Override
    public void scan(String basePackage) {
        // scan
        URL resource = this.getClass().getResource("/" + basePackage.replace(".", "/") );
        File file = new File(resource.getPath());
        for (String fileName : file.list()) {
            System.out.println(fileName);
        }
//        String com = basePackage_Path.substring(basePackage_Path.indexOf("com"), basePackage_Path.indexOf(".class"));
//        Class<?> aClass = null;
//        try {
//            aClass = classLoader.loadClass(com.replace("//", "."));
//            if (aClass.isAnnotationPresent(Scope.class)) {
//                beanDefinition.setScope(aClass.getAnnotation(Scope.class).toString());
//            }
//            if (aClass.isAnnotationPresent(Lazy.class)) {
//                beanDefinition.setLazyInit(aClass.getAnnotation(Lazy.class).toString());
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public Object getBean(String beanName) {
        return null;
    }
}
