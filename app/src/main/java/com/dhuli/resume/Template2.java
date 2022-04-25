package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Template2 extends AppCompatActivity {

    TextView name_txt,mobileno_txt,course_txt,start_txt,githublink_txt,linkedlink_txt,Course_txt1,collage_txt,grade_txt,email_txt,company_txt,address_txt,Skill1_txt,Skill2_txt,about_txt,Skill3_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template2);

        name_txt = findViewById(R.id.name_txt);
        mobileno_txt = findViewById(R.id.mobileno_txt);
        email_txt = findViewById(R.id.email_txt);
        address_txt = findViewById(R.id.address_txt);
        Skill1_txt = findViewById(R.id.Skill1_txt);
        Skill2_txt = findViewById(R.id.Skill2_txt);
        Skill3_txt = findViewById(R.id.Skill3_txt);
        course_txt = findViewById(R.id.course_txt);
        about_txt = findViewById(R.id.about_txt);
        company_txt = findViewById(R.id.company_txt);
        start_txt = findViewById(R.id.start_txt);
        Course_txt1 = findViewById(R.id.course_txt1);
        collage_txt = findViewById(R.id.collage_txt);
        grade_txt = findViewById(R.id.grade_txt);
        githublink_txt = findViewById(R.id.githublink_txt);
        linkedlink_txt = findViewById(R.id.linkedlink_txt);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String mobileno = getIntent().getStringExtra("mobileno");
        String email = getIntent().getStringExtra("email");
        String address = getIntent().getStringExtra("address");
        String Skill1 = getIntent().getStringExtra("Skill1");
        String Skill2 = getIntent().getStringExtra("Skill2");
        String Skill3 = getIntent().getStringExtra("Skill3");
        String course = getIntent().getStringExtra("course");
        String about = getIntent().getStringExtra("about");
        String company = getIntent().getStringExtra("company");
        String start = getIntent().getStringExtra("start");
        String end = getIntent().getStringExtra("end");
        String collage = getIntent().getStringExtra("collage");
        String grade = getIntent().getStringExtra("grade");
        String githublink = getIntent().getStringExtra("githublink");
        String linkedlink = getIntent().getStringExtra("linkedlink");


        name_txt.setText(""+name+surname);
        mobileno_txt.setText(""+mobileno);
        email_txt.setText(""+email);
        address_txt.setText(""+address);
        Skill1_txt.setText(""+Skill1);
        Skill2_txt.setText(""+Skill2);
        Skill3_txt.setText(""+Skill3);
        course_txt.setText(""+course);
        about_txt.setText(""+about);
        company_txt.setText(""+company);
        collage_txt.setText(""+collage);
        grade_txt.setText(""+grade);
        Course_txt1.setText(""+course);
        start_txt.setText(""+start+"-"+end);
        githublink_txt.setText(""+githublink);
        linkedlink_txt.setText(""+linkedlink);


    }
}