package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtN1 ;
    EditText edtN2 ;
    TextView txtResult ;
    Button btnAdd ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    edtN1 = (EditText)findViewById(R.id.edittxt);
    edtN2 = (EditText)findViewById(R.id.edittxt1);
    txtResult = (TextView) findViewById(R.id.txtview);
    btnAdd =(Button)findViewById(R.id.btn);
}