import com.AppConfig;
import com.yiibai.customer.services.CustomerService;
import com.yiibai.hello.HelloWorld;
import com.yiibai.output.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-config.xml");
////        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
////        helloWorld.sayHello();

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
//        helloWorld.sayHello("6666");
//
//        helloWorld.sayHello("123");
//
//        Customer customer = (Customer) context1.getBean("CustomerBean");
//        System.out.println(customer.toString());
//
//        CustomerService customerService = (CustomerService) context1.getBean("CustomerService");
//        customerService.printUrl();

//        CustomerService customerService1 = (CustomerService) context1.getBean("customerServiceProxy");
//        customerService1.printName();
//        customerService1.printUrl();

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-config.xml"});
        CustomerService customerService = (CustomerService) context.getBean("customerServiceProxy");
//        System.out.println(customerService);
        customerService.printName();
    }
}
