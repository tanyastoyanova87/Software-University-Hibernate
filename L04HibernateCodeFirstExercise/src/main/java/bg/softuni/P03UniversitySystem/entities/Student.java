package bg.softuni.P03UniversitySystem.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends Person {
    @Column(name = "average_grade")
    private double averageGrade;

    @Basic
    private int attendance;

    @ManyToMany(mappedBy = "students")
    private Set<Course> courses;

    public Student() {
        this.courses = new HashSet<>();
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}
