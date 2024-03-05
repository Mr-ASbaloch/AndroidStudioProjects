package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText edtN1;
    EditText edtN2;
    TextView txtResult;
    Button btnAdd, btnSub, btnMul, btnDiv, btnC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtN1=(EditText)findViewById(R.id.txt1);

        edtN2 =(EditText)findViewById(R.id.txt2);

        btnAdd=(Button)findViewById(R.id.btnAdd) ;
        btnSub=(Button)findViewById(R.id.btnSub) ;
        btnDiv=(Button)findViewById(R.id.btnDiv) ;
        btnMul=(Button)findViewById(R.id.btnMul) ;
        btnC=(Button)findViewById(R.id.btnClear) ;

        txtResult=(TextView)findViewById(R.id.viewtxt);

       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double oper1=Double.parseDouble(edtN1.getText().toString());
               double oper2=Double.parseDouble(edtN2.getText().toString());

               txtResult.setText(Double.toString(oper1 + oper2));
           }
       });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1=Double.parseDouble(edtN1.getText().toString());
                double oper2=Double.parseDouble(edtN2.getText().toString());

                txtResult.setText(Double.toString(oper1 - oper2));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1=Double.parseDouble(edtN1.getText().toString());
                double oper2=Double.parseDouble(edtN2.getText().toString());

                txtResult.setText(Double.toString(oper1 * oper2));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double oper1=Double.parseDouble(edtN1.getText().toString());
                double oper2=Double.parseDouble(edtN2.getText().toString());

                txtResult.setText(Double.toString(oper1 / oper2));
            }
        });
    }
}