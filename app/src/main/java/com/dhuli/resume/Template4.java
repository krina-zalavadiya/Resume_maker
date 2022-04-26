package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Template4 extends AppCompatActivity {


    TextView name_txt, course_txt,about_txt, Skill1_txt, Skill2_txt, Skill3_txt, hobbie_txt, collage_txt, course_txt1, grade_txt, start_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template4);

        name_txt = findViewById(R.id.name_txt);
        about_txt = findViewById(R.id.about_txt);
        collage_txt = findViewById(R.id.collage_txt);
        course_txt = findViewById(R.id.course_txt);
        course_txt1 = findViewById(R.id.course_txt1);
        Skill1_txt = findViewById(R.id.Skill1_txt);
        Skill2_txt = findViewById(R.id.Skill2_txt);
        Skill3_txt = findViewById(R.id.Skill3_txt);
        hobbie_txt = findViewById(R.id.hobbie_txt);
        grade_txt = findViewById(R.id.grade_txt);
        start_txt = findViewById(R.id.name_txt);


        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String email = getIntent().getStringExtra("email");
        String mobileno = getIntent().getStringExtra("mobileno");
        String course = getIntent().getStringExtra("course");
        String hobbie = getIntent().getStringExtra("hobbie");
        String grade = getIntent().getStringExtra("grade");
        String about = getIntent().getStringExtra("about");
        String collage  = getIntent().getStringExtra("collage");
        String Skill1 = getIntent().getStringExtra("Skill1");
        String Skill2 = getIntent().getStringExtra("Skill2");
        String start = getIntent().getStringExtra("start");
        String end = getIntent().getStringExtra("end");
        String Skill3 = getIntent().getStringExtra("Skill3");


        name_txt.setText("" + name + surname);
        course_txt1.setText("" + course);
        course_txt.setText("" + start + "-" + end + course);
        hobbie_txt.setText("\n" + hobbie);
        Skill1_txt.setText("" + Skill1);
        Skill2_txt.setText("" + Skill2);
        collage_txt.setText("" + collage);
        Skill3_txt.setText("" + Skill3);
        grade_txt.setText("" + grade);
        about_txt.setText("" + about);


    }
}