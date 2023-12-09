package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Library library = context.getBean("myLibrary", Library.class);
//        Library library = new Book();
//        Library library = new Person(library);
//        person.YourOrder();

        Person person = context.getBean("myPerson", Person.class);
//        person.YourOrder();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
