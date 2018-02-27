package application.service;

import application.model.Mark;
import application.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarkService {
    private List<Mark> marks = new ArrayList <Mark> ();

    public void pushMark(Mark mark) {
        marks.add(mark);
    }

    public List <Mark> getMarks() {
        return marks;
    }
}
