package springjdbc;

import java.util.List;

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
    
    
    // INSERT
        // student.setId(586);
        // student.setName("Jay");
        // student.setCity("Malegaon");
        // int r = studentDao.insert(student);
        // System.out.println("Student inserted: " + r);

        
        
    // UPDATE
        // student.setId(502);
        // student.setName("Sachin");
        // student.setCity("Mumbai");
        // studentDao.change(student);
        // System.out.println("Data updated");
    
    
    
    // DELETE
        student.setId(586);
        studentDao.delete(student);
        System.out.println("Data deleted");
    
    // SELECT Student
        // Student student = studentDao.getStudent(401);
        // System.out.println(student);
        // System.out.println("Student fetched");

    // SELECT All Students

        List<Student> students = studentDao.getAllStudents();
        for(Student s: students) {
            System.out.println(s);
        }
    
}
}
