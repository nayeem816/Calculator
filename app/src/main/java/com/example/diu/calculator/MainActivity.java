package com.example.diu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { // AppCompstActivity hoche sub activity main activity er

    EditText e1,e2;
    Button b1,b2,b3,b4;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        b1 = (Button) findViewById(R.id.plus);
        b2 = (Button) findViewById(R.id.minus);
        b3 = (Button) findViewById(R.id.mul);
        b4 = (Button) findViewById(R.id.div);
        tv = (TextView) findViewById(R.id.tv);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {//view hocche event handler

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);
        switch (view.getId()){
            case R.id.plus:
                Double result = d1+d2;
                tv.setText(String.valueOf(result));
                break;
            case R.id.minus:
                Double result1 = d1-d2;
                tv.setText(String.valueOf(result1));
                break;
            case R.id.mul:
                Double result2 = d1*d2;
                tv.setText(String.valueOf(result2));
                break;
            case R.id.div:
                Double result3 = d1/d2;
                tv.setText(String.valueOf(result3));
                break;
        }
    }
}
