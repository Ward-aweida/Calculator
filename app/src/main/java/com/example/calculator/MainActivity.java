package com.example.calculator;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText opretion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opretion = findViewById(R.id.opretion);
        //  Calculator calculate = new Calculator();
        Calculator2 calculator2 =new Calculator2();
        calculator2.performOperation(10.5);
        calculator2.performOperation("+");
        calculator2.performOperation(5.2);
        calculator2.performOperation("*");
        calculator2.performOperation(10);
        calculator2.performOperation("=");
        opretion.setText(""+calculator2.getResult());
    }
}