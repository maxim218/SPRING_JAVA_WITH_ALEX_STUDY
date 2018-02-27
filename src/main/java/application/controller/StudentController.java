package application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/students")
public class StudentController {
    @GetMapping(path="/index", produces="application/json")
    public ResponseEntity index() {
        return ResponseEntity.ok("It is body of answer");
    }
}
