package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void add(View view){

        EditText firstNum = (EditText) findViewById(R.id.editTextTextPersonName);
        String num1String = firstNum.getText().toString();

        double num1 = Double.parseDouble(num1String);

        EditText secNum = (EditText) findViewById(R.id.editTextTextPersonName2);
        String num2String = secNum.getText().toString();

        double num2 = Double.parseDouble(num2String);

        double sum = num1 + num2;
        String sumString = Double.toString(sum);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", sumString);
        startActivity(intent);

    }

    public void divide(View view){

        EditText firstNum = (EditText) findViewById(R.id.editTextTextPersonName);
        String num1String = firstNum.getText().toString();

        double num1 = Double.parseDouble(num1String);

        EditText secNum = (EditText) findViewById(R.id.editTextTextPersonName2);
        String num2String = secNum.getText().toString();

        double num2 = Double.parseDouble(num2String);

        double sum = num1 / num2;
        String sumString = Double.toString(sum);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", sumString);
        startActivity(intent);

    }

    public void subtract(View view){

        EditText firstNum = (EditText) findViewById(R.id.editTextTextPersonName);
        String num1String = firstNum.getText().toString();

        double num1 = Double.parseDouble(num1String);

        EditText secNum = (EditText) findViewById(R.id.editTextTextPersonName2);
        String num2String = secNum.getText().toString();

        double num2 = Double.parseDouble(num2String);

        double sum = num1 - num2;
        String sumString = Double.toString(sum);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", sumString);
        startActivity(intent);

    }

    public void multiply(View view){

        EditText firstNum = (EditText) findViewById(R.id.editTextTextPersonName);
        String num1String = firstNum.getText().toString();

        double num1 = Double.parseDouble(num1String);

        EditText secNum = (EditText) findViewById(R.id.editTextTextPersonName2);
        String num2String = secNum.getText().toString();

        double num2 = Double.parseDouble(num2String);

        double sum = num1 * num2;
        String sumString = Double.toString(sum);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", sumString);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}