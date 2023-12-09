package org.chdtu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    @Qualifier("magazineBean")
    @Autowired
    private Library library;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

  @Autowired
    public Person(
            @Qualifier("magazineBean") Library library) {
        System.out.println("Person bean is created");
        this.library = library;
    }


   @Autowired
    public void setLibrary(@Qualifier("magazineBean") Library library) {
        System.out.println("Class Person: set Library");
        this.library = library;
   }



    public void YourOrder() {
        System.out.println("I want that...");
        library.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
