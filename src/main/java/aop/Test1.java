package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

       UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        universityLibrary.getBook();
        universityLibrary.returnBook();
        universityLibrary.getMagazine();
        universityLibrary.getNewspaper("Черкаський край.");

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        Book1 book1 = context.getBean("book", Book1.class);
        schoolLibrary.addBook("Andriy", book1);
        schoolLibrary.addMagazine();

        Book1 book = context.getBean("book", Book1.class);
        universityLibrary.getBook();

        schoolLibrary.getMagazine();
      //  schoolLibrary.addBook();

        context.close();
    }
}
