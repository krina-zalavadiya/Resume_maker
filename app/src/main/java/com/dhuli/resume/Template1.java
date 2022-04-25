package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Template1 extends AppCompatActivity {

    TextView name_txt,surname_txt,course_txt1,collage_txt,grade_txt,course_txt,mobileno_txt,address_txt,email_txt,Skill1_txt,experience_txt,Skill2_txt,Skill3_txt,about_txt,hobbie_txt,start_txt,end_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template1);

         name_txt = findViewById(R.id.name_txt);
         about_txt = findViewById(R.id.about_txt);
         surname_txt = findViewById(R.id.surname_txt);
         course_txt = findViewById(R.id.course_txt);
         course_txt1 = findViewById(R.id.course_txt1);
         collage_txt = findViewById(R.id.collage_txt);
         grade_txt = findViewById(R.id.grade_txt);
         mobileno_txt = findViewById(R.id.mobileno_txt);
         address_txt = findViewById(R.id.address_txt);
         email_txt = findViewById(R.id.email_txt);
         Skill1_txt = findViewById(R.id.Skill1_txt);
         Skill2_txt = findViewById(R.id.Skill2_txt);
         hobbie_txt = findViewById(R.id.hobbie_txt);
         Skill3_txt = findViewById(R.id.Skill3_txt);
         start_txt = findViewById(R.id.start_txt);
         end_txt = findViewById(R.id.end_txt);
         experience_txt = findViewById(R.id.experience_txt);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String course = getIntent().getStringExtra("course");
        String mobileno = getIntent().getStringExtra("mobileno");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");
        String Skill1 = getIntent().getStringExtra("Skill1");
        String Skill2 = getIntent().getStringExtra("Skill2");
        String Skill3 = getIntent().getStringExtra("Skill3");
        String about = getIntent().getStringExtra("about");
        String hobbie = getIntent().getStringExtra("hobbie");
        String start = getIntent().getStringExtra("start");
        String end = getIntent().getStringExtra("end");
        String company = getIntent().getStringExtra("company");
        String collage = getIntent().getStringExtra("collage");
        String grade = getIntent().getStringExtra("grade");

        name_txt.setText(""+name);
        surname_txt.setText(""+surname);
        course_txt.setText(""+course);
        course_txt1.setText(""+course);
        mobileno_txt.setText(""+mobileno);
        address_txt.setText(""+address);
        email_txt.setText(""+email);
        Skill1_txt.setText(""+Skill1);
        Skill2_txt.setText(""+Skill2);
        Skill3_txt.setText(""+Skill3);
        about_txt.setText(""+about);
        hobbie_txt.setText("\n"+hobbie);
        start_txt.setText(""+start);
        end_txt.setText(""+end);
        experience_txt.setText(""+company);
        collage_txt.setText(""+collage);
        grade_txt.setText(""+grade);

    }
}