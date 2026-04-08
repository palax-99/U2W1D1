package AntoninoPalazzolo.U2W1D1;

import AntoninoPalazzolo.U2W1D1.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U2W1D1Application.class, args);


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1Application.class);
        Pizza marherita = ctx.getBean("margheritaPizza", Pizza.class);
        System.out.println(marherita);
        Pizza salami = ctx.getBean("salamiPizza", Pizza.class);
        System.out.println(salami);
    }

}
