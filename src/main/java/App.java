import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBen2 = (Cat) applicationContext.getBean("cat");

        HelloWorld helloBean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloBean2 = (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(helloBean.getMessage());
        System.out.println(helloBean2.getMessage());
        System.out.println(helloBean == helloBean2);

        System.out.println(catBean == catBen2);
    }
}