package dao;

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
    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
