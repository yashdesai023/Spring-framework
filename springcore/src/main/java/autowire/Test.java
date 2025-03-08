package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("autowire/auto_wire_config.xml");
        Emp Emp01 = context.getBean("Emp01", Emp.class);
        System.out.println(Emp01);
    }
}
