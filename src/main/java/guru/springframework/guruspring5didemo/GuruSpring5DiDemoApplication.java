package guru.springframework.guruspring5didemo;

import guru.springframework.guruspring5didemo.controllers.ConstructorInjectedController;
import guru.springframework.guruspring5didemo.controllers.GetterInjectedController;
import guru.springframework.guruspring5didemo.controllers.MyController;
import guru.springframework.guruspring5didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GuruSpring5DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(GuruSpring5DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}

