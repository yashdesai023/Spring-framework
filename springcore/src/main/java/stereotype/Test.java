package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype/stereotype_config.xml"); 
        Student student1 = context.getBean("obj", Student.class);       
        System.out.println(student1);
    }
}
