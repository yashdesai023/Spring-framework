package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import entities.Student;

public class StudentDao {
    private SessionFactory sessionFactory;
//INSERT
    @Transactional
    public int insert(Student student) {
        // Use the current session to save the student
        sessionFactory.getCurrentSession().save(student);
        return student.getId();
    }
//SELECT 
    @Transactional(readOnly = true)
    public Student getStudent(int studentId) {
        // Use the current session to get the student
        return sessionFactory.getCurrentSession().get(Student.class, studentId);
    }
//SELECT ALL
    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        // Use the current session to get all students
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }
//DELETE 
    @Transactional
    public void deleteStudent(int studentId) {
        // Use the current session to delete the student
        Student student = sessionFactory.getCurrentSession().get(Student.class, studentId);
        sessionFactory.getCurrentSession().delete(student);
    }
//UPDATE
    @Transactional  
    public void updateStudent(Student student) {
        // Use the current session to update the student
        sessionFactory.getCurrentSession().update(student);
    }



    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
