import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(secondBean == bean);
        Cat beanCat = applicationContext.getBean(Cat.class);
        Cat secondBeanCat = applicationContext.getBean(Cat.class);
        System.out.println(beanCat == secondBeanCat);

    }
}