package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections/collection_config.xml");
        Student Student01 = (Student) context.getBean("Student01"); 

        System.out.println(Student01.getNames());
        System.out.println(Student01.getPhones());
        System.out.println(Student01.getAddresses());
        System.out.println(Student01.getCourses());
    }
}
