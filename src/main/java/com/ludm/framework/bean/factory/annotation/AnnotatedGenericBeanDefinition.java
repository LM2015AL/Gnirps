package com.ludm.framework.bean.factory.annotation;

import com.ludm.framework.bean.factory.config.BeanDefinition;

import java.lang.annotation.Annotation;

public class AnnotatedGenericBeanDefinition implements BeanDefinition {

    private Object beanClass;
    private Annotation[] annotations;
    private String scope;
    private String lazyInit;

    public Object getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Object beanClass) {
        this.beanClass = beanClass;
        annotations = beanClass.getClass().getAnnotations();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(String lazyInit) {
        this.lazyInit = lazyInit;
    }

    public Annotation[] getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotation[] annotations) {
        this.annotations = annotations;
    }
}
