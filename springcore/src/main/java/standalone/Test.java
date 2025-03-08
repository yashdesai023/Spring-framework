package standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone/standalone_collection_config.xml");
        Person person = (Person) context.getBean("Person01");
        System.out.println(person.getFriends());
        System.out.println(person.getFriends().getClass().getName());
        System.out.println("--------------------------------------------------------");
        System.out.println(person.getFeestructure());
        System.out.println(person.getFeestructure().getClass().getName());
        System.out.println("--------------------------------------------------------");
        System.out.println(person.getMyproperties());
        System.out.println(person.getMyproperties().getClass().getName());
    }
}
