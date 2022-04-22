package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Refrence extends AppCompatActivity {

    EditText company1,weblink;
    TextView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrence);

        company1 = findViewById(R.id.company1);
        weblink = findViewById(R.id.weblink);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String com1 = company1.getText().toString();
                String web = weblink.getText().toString();

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

                Intent intent = new Intent(Refrence.this,Template.class);
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("brithdate",brithdate);
                intent.putExtra("email",email);
                intent.putExtra("mobileno",mobileno);
                intent.putExtra("gender",gender);
                intent.putExtra("course",course);
                intent.putExtra("collage",collage);
                intent.putExtra("grade",grade);
                intent.putExtra("company",company);
                intent.putExtra("year",year);
                intent.putExtra("grade",grade);
                intent.putExtra("end",end);
                intent.putExtra("grade",grade);
                intent.putExtra("skill",skill);
                intent.putExtra("githublink",githublink);
                intent.putExtra("linkedlink",linkedlink);
                intent.putExtra("start",start);
                intent.putExtra("companyname",com1);
                intent.putExtra("weblink",web);
                startActivity(intent);

            }
        });
    }
}