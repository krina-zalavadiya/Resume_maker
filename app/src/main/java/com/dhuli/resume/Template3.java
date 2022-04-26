package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Template3 extends AppCompatActivity {

    TextView mobileno_txt,email_txt,address_txt,course_txt1,hobbie_txt,name_txt,about_txt,start_txt,Skill1_txt,Skill2_txt,Skill3_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template3);


        mobileno_txt = findViewById(R.id.mobileno_txt);
        email_txt = findViewById(R.id.email_txt);
        course_txt1 = findViewById(R.id.course_txt1);
        address_txt = findViewById(R.id.address_txt);
        hobbie_txt = findViewById(R.id.hobbie_txt);
        name_txt = findViewById(R.id.name_txt);
        about_txt = findViewById(R.id.about_txt);
        start_txt = findViewById(R.id.start_txt);
        Skill1_txt = findViewById(R.id.Skill1_txt);
        Skill2_txt = findViewById(R.id.Skill2_txt);
        Skill3_txt = findViewById(R.id.Skill3_txt);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String email = getIntent().getStringExtra("email");
        String mobileno = getIntent().getStringExtra("mobileno");
        String course = getIntent().getStringExtra("course");
        String hobbie = getIntent().getStringExtra("hobbie");
        String about = getIntent().getStringExtra("about");
        String Skill1 = getIntent().getStringExtra("Skill1");
        String Skill2 = getIntent().getStringExtra("Skill2");
        String start = getIntent().getStringExtra("start");
        String end = getIntent().getStringExtra("end");
        String Skill3 = getIntent().getStringExtra("Skill3");

        name_txt.setText(""+name+surname);
        course_txt1.setText(""+course);

        start_txt.setText(""+start+"-"+end+course);
        email_txt.setText(""+email);
        mobileno_txt.setText(""+mobileno);
        hobbie_txt.setText("\n"+hobbie);
        about_txt.setText(""+about);
        Skill1_txt.setText(""+Skill1);
        Skill2_txt.setText(""+Skill2);
        Skill3_txt.setText(""+Skill3);



    }
}