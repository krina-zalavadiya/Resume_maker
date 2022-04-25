package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Work extends AppCompatActivity {


    EditText githublink,linkedlink;
    TextView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        githublink =  findViewById(R.id.githublink);
        linkedlink = findViewById(R.id.linkedlink);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String li1 = githublink.getText().toString();
                String li2 = linkedlink.getText().toString();

                String name = getIntent().getStringExtra("name");
                String surname = getIntent().getStringExtra("surname");
                String brithdate = getIntent().getStringExtra("brithdate");
                String email = getIntent().getStringExtra("email");
                String mobileno = getIntent().getStringExtra("mobileno");
                String gender = getIntent().getStringExtra("gender");
                String course = getIntent().getStringExtra("course");
                String collage = getIntent().getStringExtra("collage");
                String grade = getIntent().getStringExtra("grade");
                String hobbie = getIntent().getStringExtra("hobbie");
                String address = getIntent().getStringExtra("address");
                String company = getIntent().getStringExtra("company");
                String year = getIntent().getStringExtra("year");
                String start = getIntent().getStringExtra("start");
                String end = getIntent().getStringExtra("end");
                String Skill1 = getIntent().getStringExtra("Skill1");
                String about = getIntent().getStringExtra("about");
                String Skill2 = getIntent().getStringExtra("Skill2");
                String Skill3 = getIntent().getStringExtra("Skill3");

                Intent intent = new Intent(Work.this,Refrence.class);
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("brithdate",brithdate);
                intent.putExtra("email",email);
                intent.putExtra("mobileno",mobileno);
                intent.putExtra("gender",gender);
                intent.putExtra("course",course);
                intent.putExtra("collage",collage);
                intent.putExtra("grade",grade);
                intent.putExtra("about",about);
                intent.putExtra("company",company);
                intent.putExtra("hobbie",hobbie);
                intent.putExtra("address",address);
                intent.putExtra("year",year);
                intent.putExtra("grade",grade);
                intent.putExtra("end",end);
                intent.putExtra("grade",grade);
                intent.putExtra("start",start);
                intent.putExtra("Skill1",Skill1);
                intent.putExtra("Skill2",Skill2);
                intent.putExtra("Skill3",Skill3);
                intent.putExtra("githublink",li1);
                intent.putExtra("linkedlink",li2);
                startActivity(intent);


            }
        });
    }
}