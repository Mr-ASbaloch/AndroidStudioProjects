package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtName , txtPassword;
    Button btnSubmit , btnSignUp , implictbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName =(EditText)findViewById(R.id.uName);
        txtPassword=(EditText) findViewById(R.id.uPassword);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        btnSignUp=(Button)findViewById(R.id.signup) ;
        implictbtn=(Button)findViewById(R.id.btnGoogle);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        implictbtn.setOnClickListener(v -> {
            Intent intent =new Intent(Intent.ACTION_VIEW , Uri.parse("https://google.com"));
            startActivity(intent);
        });


    }

}