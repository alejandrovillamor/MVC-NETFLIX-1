package com.example.mvc_netflix_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvc_netflix_1.controller.StudentController;
import com.example.mvc_netflix_1.controller.UserController;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.UserWS;
import com.example.mvc_netflix_1.model.pojo.Student;
import com.example.mvc_netflix_1.model.pojo.User;

public class MainActivity extends AppCompatActivity {
     private StudentController controller;
     private MainActivity view;
     private StudentWS model;
     private UserController controlleruser;
     private UserWS modeluser;
     private Button btnbutton;
     private  EditText editTextemail;
     private  EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Cargar view
        view = this;
        //Cargar model
        //model + view
        controller =  new StudentController(model, view);
        controlleruser = new UserController(modeluser,view);
        //Caso de uso -> OBTENER ESTUDIANTE
        controller.getStudent();
        controlleruser.getUser();
        btnbutton = (Button) findViewById(R.id.button);
        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newEmail =   editTextemail.getText().toString();
                String newPassword = editTextPassword.getText().toString();

                modeluser.getUser(newEmail,newPassword);
                printUserDetails(modeluser.getUser(newEmail,newPassword));
            }
        });

    }

    public void printStudentDetails(Student student){
        Log.d("MainActivity - NAME",student.getName());
        Log.d("MainActivity - NAME",student.getSurname());
    }
    public void printUserDetails(User user){
        EditText email = (EditText) findViewById(R.id.editTextemail);
        email.setText(user.getEmail());
        EditText password = (EditText) findViewById(R.id.editTextPassword);
        password.setText(user.getPassword());
    }
}