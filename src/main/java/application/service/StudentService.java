package application.service;

import application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {
    private NamedParameterJdbcTemplate template;
    private RowMapper <Student> STUDENT_MAPPER = (res, num) -> new Student(
            res.getInt("student_id"),
            res.getString("student_name")
    );

    @Autowired
    public StudentService(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    public void push(Student student) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("student_id", student.getId());
        params.addValue("student_name", student.getName());
        template.update("INSERT INTO students (student_id, student_name) VALUES (:student_id,:student_name);", params);
    }

    public List <Student> getAll() {
        MapSqlParameterSource params = new MapSqlParameterSource();
        List <Student> my_students_list = template.query("SELECT student_id, student_name FROM students ORDER BY student_id DESC;", params, STUDENT_MAPPER);
        return my_students_list;
    }

    public String getStudentName(int studentId) {
        return "Wait";
    }
}
