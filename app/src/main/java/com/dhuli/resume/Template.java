package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Template extends AppCompatActivity {

    Button i1,i2,i3,i4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);


        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String brithdate = getIntent().getStringExtra("brithdate");
        String email = getIntent().getStringExtra("email");
        String mobileno = getIntent().getStringExtra("mobileno");
        String gender = getIntent().getStringExtra("gender");
        String course = getIntent().getStringExtra("course");
        String collage = getIntent().getStringExtra("collage");
        String grade = getIntent().getStringExtra("grade");
        String company = getIntent().getStringExtra("company");
        String year = getIntent().getStringExtra("year");
        String start = getIntent().getStringExtra("start");
        String end = getIntent().getStringExtra("end");
        String skill = getIntent().getStringExtra("skill");
        String githublink = getIntent().getStringExtra("githublink");
        String linkedlink = getIntent().getStringExtra("linkedlink");
        String companyname = getIntent().getStringExtra("companyname");
        String weblink = getIntent().getStringExtra("weblink");

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Template.this,Template1.class);


                startActivity(intent);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Template.this,Template2.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Template.this,Template3.class);

                startActivity(intent);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Template.this,Template4.class);

                startActivity(intent);
            }
        });

    }
}