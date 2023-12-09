package org.chdtu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.YourOrder();
        Library magazine1 = context.getBean("magazineBean", Library.class);
        Library magazine2 = context.getBean("magazineBean", Library.class);

        magazine1.say();

        context.close();
    }
}
