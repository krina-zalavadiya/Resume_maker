package com.dhuli.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText name,surname,brithdate,email,mobileno;
    RadioGroup gender;
    TextView next;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          name = findViewById(R.id.name);
          surname = findViewById(R.id.surname);
          brithdate = findViewById(R.id.brithdate);
          email = findViewById(R.id.email);
          mobileno = findViewById(R.id.mobileno);
          gender = findViewById(R.id.gender);
          next = findViewById(R.id.next);

          next.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  String n = name.getText().toString();
                  String s = surname.getText().toString();
                  String b = brithdate.getText().toString();
                  String e = email.getText().toString();
                  String m = mobileno.getText().toString();

                  int id = gender.getCheckedRadioButtonId();
                  RadioButton button = findViewById(id);

                  Intent intent = new Intent(MainActivity.this,Education.class);
                  intent.putExtra("name",n);
                  intent.putExtra("surname",s);
                  intent.putExtra("brithdate",b);
                  intent.putExtra("email",e);
                  intent.putExtra("mobileno",m);
                  intent.putExtra("gender",button.getText().toString());
                  startActivity(intent);

              }
          });



    }
}