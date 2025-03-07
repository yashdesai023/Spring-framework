package lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext  context = new ClassPathXmlApplicationContext("lifecycle/lyf_config.xml");
        context.registerShutdownHook();
        Samosa Samosa01 = (Samosa) context.getBean("Samosa01");
        System.out.println(Samosa01);
        

        System.out.println("++++++++++++++++++++++++++++");

        Pepsi p1 = (Pepsi) context.getBean("Pepsi01");
        System.out.println(p1);
 
    }
}
