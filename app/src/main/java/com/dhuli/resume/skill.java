package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class skill extends AppCompatActivity {


    EditText Skill1,Skill2,Skill3;
    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        Skill1 = findViewById(R.id.Skill1);
        Skill2 = findViewById(R.id.Skill2);
        Skill3 = findViewById(R.id.Skill3);
        next = findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sk1 = Skill1.getText().toString();
                String sk2 = Skill2.getText().toString();
                String sk3 = Skill2.getText().toString();

                String name = getIntent().getStringExtra("name");
                String surname = getIntent().getStringExtra("surname");
                String brithdate = getIntent().getStringExtra("brithdate");
                String hobbie = getIntent().getStringExtra("hobbie");
                String email = getIntent().getStringExtra("email");
                String mobileno = getIntent().getStringExtra("mobileno");
                String gender = getIntent().getStringExtra("gender");
                String course = getIntent().getStringExtra("course");
                String collage = getIntent().getStringExtra("collage");
                String grade = getIntent().getStringExtra("grade");
                String company = getIntent().getStringExtra("company");
                String about = getIntent().getStringExtra("about");
                String year = getIntent().getStringExtra("year");
                String start = getIntent().getStringExtra("start");
                String address = getIntent().getStringExtra("address");
                String end = getIntent().getStringExtra("end");
                String githublink = getIntent().getStringExtra("githublink");
                String linkedlink = getIntent().getStringExtra("linkedlink");


                Intent intent = new Intent(skill.this,Work.class);
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("brithdate",brithdate);
                intent.putExtra("email",email);
                intent.putExtra("mobileno",mobileno);
                intent.putExtra("gender",gender);
                intent.putExtra("course",course);
                intent.putExtra("collage",collage);
                intent.putExtra("grade",grade);
                intent.putExtra("hobbie",hobbie);
                intent.putExtra("company",company);
                intent.putExtra("year",year);
                intent.putExtra("address",address);
                intent.putExtra("grade",grade);
                intent.putExtra("end",end);
                intent.putExtra("about",about);
                intent.putExtra("grade",grade);
                intent.putExtra("start",start);
                intent.putExtra("githublink",githublink);
                intent.putExtra("linkedlink",linkedlink);
                intent.putExtra("Skill1",sk1);
                intent.putExtra("Skill2",sk2);
                intent.putExtra("Skill3",sk3);
                startActivity(intent);

            }
        });
    }
}