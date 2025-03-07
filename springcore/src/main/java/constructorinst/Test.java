package constructorinst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinst/ci_config.xml");
        Person p = (Person) context.getBean("Person01");
        System.out.println(p);

        Addition add = (Addition) context.getBean("add");
        add.doSum();
    }
}
