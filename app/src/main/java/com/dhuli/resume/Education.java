package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Education extends AppCompatActivity {

    EditText course, collage, grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);


        course = findViewById(R.id.course);
        collage = findViewById(R.id.collage);
        grade = findViewById(R.id.grade);

        String C = course.getText().toString();
        String CO = collage.getText().toString();
        String g = grade.getText().toString();

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String brithdate = getIntent().getStringExtra("brithdate");
        String email = getIntent().getStringExtra("email");
        String mobileno = getIntent().getStringExtra("mobileno");
        String gender = getIntent().getStringExtra("gender");

        Intent intent = new Intent(Education.this,Experience.class);
        intent.putExtra("course",C);
        intent.putExtra("collage",CO);
        intent.putExtra("grade",g);
        startActivity(intent);

    }
}