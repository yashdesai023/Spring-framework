package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import entities.Student;

public interface StudentDao {
    public int insert(Student student);
    public int change(Student student);
    public int delete(Student student);
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();
}
