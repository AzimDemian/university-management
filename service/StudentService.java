package service;

import model.person.Student;
import model.Course;
import java.time.LocalDate;
import java.util.ArrayList;

public class StudentService extends Student {
    public boolean addCourse (Course course){
        ArrayList <Course> temp = new ArrayList();
        temp = super.getCourses();
        temp.add(course);
        super.setCourses(temp);}
}