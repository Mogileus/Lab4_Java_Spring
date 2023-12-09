package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Library library = context.getBean("myLibrary", Library.class);
        library.say();

        context.close();
    }
}
