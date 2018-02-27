package application.controller;

import application.model.Student;
import application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path="/get_all_students", produces="application/json")
    public ResponseEntity get_all_students() {
        List <Student> students = studentService.getAll();
        return ResponseEntity.ok(students);
    }

    @PostMapping(path="/add_one_student", produces="application/json")
    public ResponseEntity add_student(@RequestBody Student body) {
        studentService.push(body);
        return ResponseEntity.ok(body);
    }
}
