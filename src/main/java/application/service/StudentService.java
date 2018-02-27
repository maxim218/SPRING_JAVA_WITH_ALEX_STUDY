package application.service;

import application.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList <Student> ();

    public void push(Student student) {
        students.add(student);
    }

    public List <Student> getAll() {
        return students;
    }
}
