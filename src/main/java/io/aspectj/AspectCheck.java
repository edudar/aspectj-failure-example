package io.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectCheck {

    @Before("execution(public * * (.., @org.springframework.core.annotation.Order (*), ..))")
    public void methodsAnnotatedWithOrder(JoinPoint joinPoint) {
        // do nothing
    }

}
