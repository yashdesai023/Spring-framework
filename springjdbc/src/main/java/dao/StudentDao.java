package dao;

import org.springframework.jdbc.core.JdbcTemplate;
import entities.Student;

public interface StudentDao {
    public int insert(Student student);
}
