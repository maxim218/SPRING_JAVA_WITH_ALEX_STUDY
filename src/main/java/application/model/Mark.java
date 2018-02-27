package application.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Mark {
    @JsonProperty("id")
    private int id;
    @JsonProperty("student_id")
    private int student_id;
    @JsonProperty("mark")
    private int mark;

    public Mark(@JsonProperty("id") int id, @JsonProperty("student_id") int student_id, @JsonProperty("mark") int mark) {
        this.id = id;
        this.student_id = student_id;
        this.mark = mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getMark() {
        return mark;
    }
}
