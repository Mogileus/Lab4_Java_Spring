package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspectCombine {

   @Pointcut("execution(* aop.SchoolLibrary.get*())")
    private void allGetMethodsFromSchoolLibrary() {}

    @Pointcut("execution(* aop.SchoolLibrary.return*())")
    private void allReturnMethodsFromSchoolLibrary() {}

    @Pointcut("allGetMethodsFromSchoolLibrary() || allReturnMethodsFromSchoolLibrary()")
    private void allGetAndReturnMethodsFromSchoolLibrary() {}

    @Before("allGetMethodsFromSchoolLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromSchoolLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromSchoolLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }
}
