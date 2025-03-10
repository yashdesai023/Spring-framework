package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import entities.Student;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;  // Move this outside the method

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }
    @Override
    public int change(Student student) {
        String query = "UPDATE student SET name = ?, city = ? WHERE id = ?";
        return this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
    }

    @Override
    public int delete(Student student) {
        String query = "DELETE FROM student WHERE id = ?";
        return this.jdbcTemplate.update(query, student.getId());
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "SELECT * FROM student WHERE id =?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "SELECT * FROM student";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }
    
    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    
}
