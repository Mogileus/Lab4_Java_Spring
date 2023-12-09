package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("Ми беремо книгу із SchoolLibrary.");
        System.out.println("-------------------------------");
    }

    public void retrunBook() {
        System.out.println("Ми повертаємо книгу у SchoolLibrary.");
        System.out.println("-------------------------------");
    }

    public void getMagazine() {
        System.out.println("Ми беремо журнал із SchoolLibrary.");
        System.out.println("-------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Ми повертаємо журнал у SchoolLibrary.");
        System.out.println("-------------------------------");
    }

    public void addBook(String userName, Book1 book1) {
        System.out.println("Ми додаємо книгу у SchoolLibrary.");
        System.out.println("-------------------------------");
    }

    public void addMagazine() {
        System.out.println("Ми додаємо журнал у SchoolLibrary.");
        System.out.println("-------------------------------");
    }
}
