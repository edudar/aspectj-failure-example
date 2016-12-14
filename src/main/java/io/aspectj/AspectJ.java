package io.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectJ {

    public static void main(String[] args) {
        SpringApplication.run(AspectJ.class, args).close();
    }

}
