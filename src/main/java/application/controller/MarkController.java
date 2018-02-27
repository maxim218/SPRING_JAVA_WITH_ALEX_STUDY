package application.controller;

import application.model.Mark;
import application.model.Student;
import application.service.MarkService;
import application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="/marks")
public class MarkController {
    public MarkService markService;

    @Autowired
    public MarkController(MarkService markService) {
        this.markService = markService;
    }

    @GetMapping(path="/get_marks", produces="application/json")
    public ResponseEntity get_marks(HttpServletRequest request) {
        System.out.println(request.getRequestURL().toString());
        List <Mark> marks = markService.getMarks();
        return ResponseEntity.ok(marks);
    }

    @PostMapping(path="/push_mark", produces="application/json")
    public ResponseEntity add_student(@RequestBody Mark body) {
        markService.pushMark(body);
        return ResponseEntity.ok("add_mark_OK");
    }
}
