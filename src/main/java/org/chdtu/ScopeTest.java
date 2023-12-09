package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Book myBook = context.getBean("book", Book.class);
        myBook.say();
        Book yourBook = context.getBean("book", Book.class);

        System.out.println("Змінні посилаються на один і той обєкт? " + (myBook == yourBook));
        System.out.println(myBook);
        System.out.println(yourBook);

        context.close();
    }
}
