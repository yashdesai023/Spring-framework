package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.StudentDao;
import entities.Student;

public class Test {
    public static void main(String[] args) {
        System.out.println("My program started");

        ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc/config.xml");

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();
        student.setId(586);
        student.setName("Jay");
        student.setCity("Malegaon");

        int r = studentDao.insert(student);
        System.out.println("Student inserted: " + r);
    }
}
