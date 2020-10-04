package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnClear,btnPoint,btnEqual;
    EditText ed1;
    boolean add,sub,mul,div;
    float res1,res2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnPoint = (Button)findViewById(R.id.btnPoint);
        btnEqual = (Button)findViewById(R.id.btnEqual);

        ed1 = (EditText)findViewById(R.id.ed1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText()==null){
                    ed1.setText("");
                }
                else {
                    add = true;
                    res1 = Float.parseFloat(ed1.getText() + "");
                    ed1.setText(null);
                }
                }

        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText()==null){
                    ed1.setText("");
                }
                else{
                    sub = true;
                    res1 = Float.parseFloat(ed1.getText() + "");
                    ed1.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText()==null){
                    ed1.setText("");
                }
                else{
                    mul = true;
                    res1 = Float.parseFloat(ed1.getText() + "");
                    ed1.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText()==null){
                    ed1.setText("");
                }
                else{
                    div = true;
                    res1 = Float.parseFloat(ed1.getText() + "");
                    ed1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(ed1.getText() + "");
                if(add==true){
                    ed1.setText(res1+res2+"");
                    add = false;
                }
                if(sub==true){
                    ed1.setText(res1-res2+"");
                    sub = false;
                }
                if(mul==true){
                    ed1.setText(res1*res2+"");
                    mul = false;
                }
                if(div==true){
                    ed1.setText(res1/res2+"");
                    div = false;
                }


            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
    }
}