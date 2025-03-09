package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import entities.Student;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;  // Move this outside the method

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
