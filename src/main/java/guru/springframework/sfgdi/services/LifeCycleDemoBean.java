package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    /**
     * InitializingBean
     */
    @Override
    public void afterPropertiesSet() {
        System.out.println("##1 Interface InitializingBean");
    }

    /**
     * DisposableBean
     */
    @Override
    public void destroy() {
        System.out.println("##1 Interface DisposableBean");
    }

    /**
     * BeanNameAware
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("##4 Interface BeanNameAware. Name is: " + name);
    }

    /**
     * BeanFactoryAware
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("##4 Interface BeanFactoryAware");
    }

    /**
     * ApplicationContextAware
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("##4 Interface ApplicationContextAware");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("##2 Annotation PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("##2 Annotation PreDestroy");
    }

    public void beforeInit(){
        System.out.println("##3 Custom method from BeanPostProcessor (before Initialization)");
    }

    public void afterInit(){
        System.out.println("##3 Custom method from BeanPostProcessor (after Initialization)");
    }
}
