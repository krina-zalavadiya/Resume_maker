package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Template2 extends AppCompatActivity {

    TextView name_txt,surname_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template2);

        name_txt = findViewById(R.id.name_txt);
        surname_txt = findViewById(R.id.surnname_txt);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");


        name_txt.setText(""+name);
        surname_txt.setText(""+surname);

    }
}