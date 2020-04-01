package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btnClickMe;
    private EditText edtEmail;
    private EditText edtPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickMe = (Button) findViewById(R.id.btnClickMe);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = "admin@123";
                String password = "s3cr3t";

                if (edtEmail.getText().toString().isEmpty()) {
                    edtEmail.setError("Field is not to be Empty");

                } else {
                    if (edtEmail.getText().toString().trim().matches(Email)) {

                        Toast.makeText(getApplicationContext(), "Log In Successful", Toast.LENGTH_SHORT).show();

                    } else {
                        edtEmail.setError("Enter valid Email Address");

                    }
                }
                if (edtPassword.getText().toString().isEmpty()) {
                    edtPassword.setError("Field is not to be Empty");
                } else {
                    if (edtPassword.getText().toString().trim().matches(password)) {


                    } else {
                        edtPassword.setError("Enter valid Password ");
                    }
                }


            }


        });

    }
}







