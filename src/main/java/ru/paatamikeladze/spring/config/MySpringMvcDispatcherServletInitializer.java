package ru.paatamikeladze.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//Заменяем web.xml
//имлементим методы от AbstractAnnotationConfigDispatcherServletInitializer
public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //данный метод не используем
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
//метод который заменяет наш aplicontext
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }
//куда переправить все запросы http диспетчеру
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
