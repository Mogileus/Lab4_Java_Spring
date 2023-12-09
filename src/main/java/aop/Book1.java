package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book1 {

    @Value("Java")
    private String name;

    @Value("Джошуа Блох")
    private String author;

    @Value("2000")
    private int yearOfPublishing;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
}
