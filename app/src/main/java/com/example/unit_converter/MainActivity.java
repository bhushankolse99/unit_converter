package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);
        c1=(CheckBox) findViewById(R.id.checkBox);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        c3=(CheckBox) findViewById(R.id.checkBox3);
        c4=(CheckBox) findViewById(R.id.checkBox4);
        c5=(CheckBox) findViewById(R.id.checkBox5);
        c6=(CheckBox) findViewById(R.id.checkBox6);
        c7=(CheckBox) findViewById(R.id.checkBox7);
        c8=(CheckBox) findViewById(R.id.checkBox8);
        t1=(EditText) findViewById(R.id.editTextTextPersonName);
        t2=(EditText) findViewById(R.id.editTextTextPersonName2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c1.isChecked() && c6.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n*1000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c1.isChecked() && c7.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n*1000000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c1.isChecked() && c8.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n*100000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c2.isChecked() && c5.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n/100000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c2.isChecked() && c6.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n/100;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c2.isChecked() && c7.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n*10;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c3.isChecked() && c5.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n/1000000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c3.isChecked() && c6.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n/1000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c3.isChecked() && c8.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n/10;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c4.isChecked() && c5.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n/1000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c4.isChecked() && c7.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n*1000;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
                if (c4.isChecked() && c8.isChecked()){
                    String s=t1.getText().toString();
                    float n=Integer.parseInt(s);
                    float r=n*100;
                    String d=String.valueOf(r);
                    t2.setText(d);
                }
            }
        });
    }

}