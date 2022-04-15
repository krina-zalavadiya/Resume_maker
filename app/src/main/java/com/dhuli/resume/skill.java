package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class skill extends AppCompatActivity {


    EditText skill;
    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        skill = findViewById(R.id.skill);
        next = findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sk = skill.getText().toString();

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


                Intent intent = new Intent(skill.this,Work.class);
                intent.putExtra("skill",sk);
                startActivity(intent);

            }
        });
    }
}