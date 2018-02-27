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

    public String getStudentName(int studentId) {
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getId() == studentId) {
                return students.get(i).getName();
            }
        }
        return "Student_not_found";
    }
}
