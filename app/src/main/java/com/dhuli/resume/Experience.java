package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Experience extends AppCompatActivity {

    TextView next;
    EditText company,year,sd,ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        company = findViewById(R.id.company);
        year = findViewById(R.id.year);
        sd = findViewById(R.id.sd);
        ed = findViewById(R.id.ed);
        next = findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String com = company.getText().toString();
                String y = year.getText().toString();
                String SD = sd.getText().toString();
                String ED = ed.getText().toString();

                String name = getIntent().getStringExtra("name");
                String surname = getIntent().getStringExtra("surname");
                String brithdate = getIntent().getStringExtra("brithdate");
                String email = getIntent().getStringExtra("email");
                String mobileno = getIntent().getStringExtra("mobileno");
                String gender = getIntent().getStringExtra("gender");
                String course = getIntent().getStringExtra("course");
                String collage = getIntent().getStringExtra("collage");
                String grade = getIntent().getStringExtra("grade");

                Intent intent = new Intent(Experience.this,skill.class);
                intent.putExtra("name",name);
                intent.putExtra("surname",surname);
                intent.putExtra("brithdate",brithdate);
                intent.putExtra("email",email);
                intent.putExtra("mobileno",mobileno);
                intent.putExtra("gender",gender);
                intent.putExtra("course",course);
                intent.putExtra("collage",collage);
                intent.putExtra("grade",grade);
                intent.putExtra("year",y);
                intent.putExtra("company",com);
                intent.putExtra("start",SD);
                intent.putExtra("end",ED);


                startActivity(intent);


            }
        });

    }
}