package org.chdtu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        //singleton
/*        Book myBook = context.getBean("myLibrary", Book.class);
        myBook.setName("Eneida");
        Book yourBook = context.getBean("myLibrary", Book.class);
        yourBook.setName("Tygrolovy");

        System.out.println(myBook.getName());
        System.out.println(yourBook.getName());*/

/*        System.out.println("Змінні посилаються на один і той же обєкт? " + (myBook == yourBook));
        System.out.println(myBook);
        System.out.println(yourBook);*/
        //singleton

        //prototype
/*        Book myBook = context.getBean("myLibrary", Book.class);
        myBook.setName("Eneida");
        Book yourBook = context.getBean("myLibrary", Book.class);
        yourBook.setName("Tygrolovy");

        System.out.println(myBook.getName());
        System.out.println(yourBook.getName());*/

/*        System.out.println("Змінні посилаються на один і той же обєкт? " + (myBook == yourBook));
        System.out.println(myBook);
        System.out.println(yourBook);*/

        //prototype

        context.close();
    }
}
