package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ce,c,backspace,divide,multiply,subtract,add,number0,number1,number2
            ,number3,number4,number5,number6,number7,number8,number9,dot,equal,
            inv,rad,sine,cosine,tangent,percentage,naturallog,log,factorial,raisepower,
            pie,exp, openbracket,closebracket,squareroot,calculatorName;
    Bundle bundle;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorName = findViewById(R.id.calcname);
        ce = findViewById(R.id.ce);ce.setText("CE");
        c = findViewById(R.id.c);c.setText("C");
        backspace = findViewById(R.id.back);backspace.setText(("<-"));
        divide = findViewById(R.id.divide);divide.setText("/");
        multiply = findViewById(R.id.multiply);multiply.setText("*");
        subtract = findViewById(R.id.subtract);subtract.setText("-");
        add = findViewById(R.id.add);add.setText("+");
        number0 = findViewById(R.id.number0);number0.setText("0");
        number1 = findViewById(R.id.number1);number1.setText("1");
        number2 = findViewById(R.id.number2);number2.setText("2");
        number3 = findViewById(R.id.number3);number3.setText("3");
        number4 = findViewById(R.id.number4);number4.setText("4");
        number5 = findViewById(R.id.number5);number5.setText("5");
        number6 = findViewById(R.id.number6);number6.setText("6");
        number7 = findViewById(R.id.number7);number7.setText("7");
        number8 = findViewById(R.id.number8);number8.setText("8");
        number9 = findViewById(R.id.number9);number9.setText("9");
        dot = findViewById(R.id.dot);dot.setText(".");
        equal = findViewById(R.id.equal);
        inv = findViewById(R.id.inverse);inv.setText("Inv");
        rad = findViewById(R.id.Rad);rad.setText("Rad");
        sine = findViewById(R.id.Sine);sine.setText("Sin");
        cosine = findViewById(R.id.Cosine);cosine.setText("Cos");
        naturallog = findViewById(R.id.naturallog);naturallog.setText("ln");
        log = findViewById(R.id.log);log.setText("Log");
        tangent = findViewById(R.id.tangent);tangent.setText("Tan");
        openbracket = findViewById(R.id.openbracket);openbracket.setText("{");
        closebracket = findViewById(R.id.closebracket);closebracket.setText("}");
        squareroot = findViewById(R.id.squareroot);squareroot.setText("sqrt");
        exp = findViewById(R.id.e);exp.setText("e");
        pie = findViewById(R.id.pie);pie.setText("pie");
        raisepower = findViewById(R.id.raisetopower);raisepower.setText("^");
        factorial = findViewById(R.id.exclamation);factorial.setText("!");
        percentage = findViewById(R.id.percentage);percentage.setText("%");
        bundle = getIntent().getExtras();
        if(bundle != null){
            String name = bundle.getString("name","error");
            calculatorName.setText(name);
        }
    }
}