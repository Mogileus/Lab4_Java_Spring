package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Book myBook = context.getBean("myLibrary", Book.class);
        myBook.say();

        context.close();
    }
}
