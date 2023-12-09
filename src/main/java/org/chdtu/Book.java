package org.chdtu;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Book implements Library{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("Class Book: init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Book: destroy method");
    }

    public Book() {
        System.out.println("Book bean is created");
    }

    @Override
    public void say() {
        System.out.println("book");
    }
}
