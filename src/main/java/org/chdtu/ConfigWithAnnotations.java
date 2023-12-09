package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Magazine myMagazine = context.getBean("magazineBean", Magazine.class);
        myMagazine.say();

        Person person = context.getBean("personBean", Person.class);
        person.YourOrder();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
