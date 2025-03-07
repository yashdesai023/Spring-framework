package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Details are follow...." );
        
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("springcore/config.xml");
            Student student1 = (Student) context.getBean("Student01");
            Student student2 = (Student) context.getBean("Student02");
            System.out.println(student1);
            System.out.println(student2);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed....");
        }
        
    }
}
