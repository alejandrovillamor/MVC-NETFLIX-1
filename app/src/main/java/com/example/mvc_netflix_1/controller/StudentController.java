package com.example.mvc_netflix_1.controller;

import com.example.mvc_netflix_1.MainActivity;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class StudentController {
    private StudentWS model;
    private MainActivity view;

    public void getStudent(){
        // threadss!!! -> RETROFIT 2
        //IRIA A WEBSERVICE REST + COGERIA DATA STUDENT + Y VOLVERIA
        Student student = model.getStudentWS();
        view.printStudentDetails(student);
    }

    public StudentController(StudentWS model, MainActivity view) {
        this.model = model;
        this.view = view;
    }
}
