package ua.kpi.models;

import jakarta.persistence.*;
import org.postgresql.util.PGInterval;

import java.time.LocalDateTime;

@Entity
@Table(name = "subject_tables")
public class SubjectTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String subject_name;
    private String description;
    private String teacher;
    private LocalDateTime lesson_datetime;
    private int number_of_seats;

    private String subject_name_cell;
    private String description_cell;
    private String teacher_cell;
    private String lesson_date_cell;
    private String start_numbering_cell;
    private String start_seats_cell;

    private PGInterval time_interval_before_closing;
    private PGInterval time_interval_before_opening;
    private PGInterval lessons_interval;

    public SubjectTable() {}

    public String getSubjectName() {
        return subject_name;
    }

    public void setSubjectName(String subjectName) {
        this.subject_name = subjectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public LocalDateTime getLessonDatetime() {
        return lesson_datetime;
    }

    public void setLessonDatetime(LocalDateTime lessonDatetime) {
        this.lesson_datetime = lessonDatetime;
    }

    public int getNumberOfSeats() {
        return number_of_seats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats <= 0) {
            throw new IllegalArgumentException("number of seats must be positive");
        }
        this.number_of_seats = numberOfSeats;
    }

    public String getSubjectNameCell() {
        return subject_name_cell;
    }

    public void setSubjectNameCell(String subjectNameCell) {
        this.subject_name_cell = subjectNameCell;
    }

    public String getDescriptionCell() {
        return description_cell;
    }

    public void setDescriptionCell(String descriptionCell) {
        this.description_cell = descriptionCell;
    }

    public String getTeacherCell() {
        return teacher_cell;
    }

    public void setTeacherCell(String teacherCell) {
        this.teacher_cell = teacherCell;
    }

    public String getLessonDateCell() {
        return lesson_date_cell;
    }

    public void setLessonDateCell(String lessonDateCell) {
        this.lesson_date_cell = lessonDateCell;
    }

    public String getStartNumberingCell() {
        return start_numbering_cell;
    }

    public void setStartNumberingCell(String startNumberingCell) {
        this.start_numbering_cell = startNumberingCell;
    }

    public String getStartSeatsCell() {
        return start_seats_cell;
    }

    public void setStartSeatsCell(String startSeatsCell) {
        this.start_seats_cell = startSeatsCell;
    }

    public PGInterval getTimeIntervalBeforeClosing() {
        return time_interval_before_closing;
    }

    public void setTimeIntervalBeforeClosing(PGInterval timeIntervalBeforeClosing) {
        this.time_interval_before_closing = timeIntervalBeforeClosing;
    }

    public PGInterval getTimeIntervalBeforeOpening() {
        return time_interval_before_opening;
    }

    public void setTimeIntervalBeforeOpening(PGInterval timeIntervalBeforeOpening) {
        this.time_interval_before_opening = timeIntervalBeforeOpening;
    }

    public PGInterval getLessonsInterval() {
        return lessons_interval;
    }

    public void setLessonsInterval(PGInterval lessonsInterval) {
        this.lessons_interval = lessonsInterval;
    }
}
