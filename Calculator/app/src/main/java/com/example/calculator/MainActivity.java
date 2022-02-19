package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    TextView ce,c,backspace,divide,multiply,subtract,add,number0,number1,number2
            ,number3,number4,number5,number6,number7,number8,number9,dot,equal,
            inv,rad,sine,cosine,tangent,percentage,naturallog,log,factorial,raisepower,
            pie,exp, openbracket,closebracket,squareroot,calculatorName,history,screentext;
    Bundle bundle;
    String pi = "3.14159265";

    //@SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatorName = findViewById(R.id.calcname);
        history = findViewById(R.id.calchistory);
        screentext = findViewById(R.id.calcval);
        ce = findViewById(R.id.ce);ce.setText("CE");ce.setOnClickListener(this);
        c = findViewById(R.id.c);c.setText("C");c.setOnClickListener(this);
        backspace = findViewById(R.id.back);backspace.setText(("<-"));backspace.setOnClickListener(this);
        divide = findViewById(R.id.divide);divide.setText("/");divide.setOnClickListener(this);
        multiply = findViewById(R.id.multiply);multiply.setText("*");multiply.setOnClickListener(this);
        subtract = findViewById(R.id.subtract);subtract.setText("-");subtract.setOnClickListener(this);
        add = findViewById(R.id.add);add.setText("+");add.setOnClickListener(this);
        number0 = findViewById(R.id.number0);number0.setText("0");number0.setOnClickListener(this);
        number1 = findViewById(R.id.number1);number1.setText("1");number1.setOnClickListener(this);
        number2 = findViewById(R.id.number2);number2.setText("2");number2.setOnClickListener(this);
        number3 = findViewById(R.id.number3);number3.setText("3");number3.setOnClickListener(this);
        number4 = findViewById(R.id.number4);number4.setText("4");number4.setOnClickListener(this);
        number5 = findViewById(R.id.number5);number5.setText("5");number5.setOnClickListener(this);
        number6 = findViewById(R.id.number6);number6.setText("6");number6.setOnClickListener(this);
        number7 = findViewById(R.id.number7);number7.setText("7");number7.setOnClickListener(this);
        number8 = findViewById(R.id.number8);number8.setText("8");number8.setOnClickListener(this);
        number9 = findViewById(R.id.number9);number9.setText("9");number9.setOnClickListener(this);
        dot = findViewById(R.id.dot);dot.setText(".");dot.setOnClickListener(this);dot.setOnClickListener(this);
        equal = findViewById(R.id.equal);equal.setOnClickListener(this);
        inv = findViewById(R.id.inverse);inv.setText("Inv");inv.setOnClickListener(this);
        rad = findViewById(R.id.Rad);rad.setText("Rad");rad.setOnClickListener(this);
        sine = findViewById(R.id.Sine);sine.setText("Sin");sine.setOnClickListener(this);
        cosine = findViewById(R.id.Cosine);cosine.setText("Cos");cosine.setOnClickListener(this);
        naturallog = findViewById(R.id.naturallog);naturallog.setText("ln");naturallog.setOnClickListener(this);
        log = findViewById(R.id.log);log.setText("Log");log.setOnClickListener(this);
        tangent = findViewById(R.id.tangent);tangent.setText("Tan");tangent.setOnClickListener(this);
        openbracket = findViewById(R.id.openbracket);openbracket.setText("{");openbracket.setOnClickListener(this);
        closebracket = findViewById(R.id.closebracket);closebracket.setText("}");closebracket.setOnClickListener(this);
        squareroot = findViewById(R.id.squareroot);squareroot.setText("sqrt");squareroot.setOnClickListener(this);
        exp = findViewById(R.id.e);exp.setText("e");exp.setOnClickListener(this);
        pie = findViewById(R.id.pie);pie.setText("pie");pie.setOnClickListener(this);
        raisepower = findViewById(R.id.raisetopower);raisepower.setText("^");raisepower.setOnClickListener(this);
        factorial = findViewById(R.id.exclamation);factorial.setText("!");factorial.setOnClickListener(this);
        percentage = findViewById(R.id.percentage);percentage.setText("%");percentage.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if(bundle != null){
            String name = bundle.getString("name","error");
            calculatorName.setText(name);
        }
    }

    @Override
    public void onClick(View view) {
        TextView t = (TextView) view;
        switch (t.getId()){
            case R.id.ce:
                screentext.setText("");
                break;
            case R.id.c:
                screentext.setText("");
                break;
            case R.id.back:
                String val = screentext.getText().toString();
                val = val.substring(0, val.length() - 1);
                screentext.setText(val);
                break;
            case R.id.divide:
                screentext.setText(screentext.getText()+"÷");
                break;
            case R.id.number0:
                screentext.setText(screentext.getText() + "0");
                break;
            case R.id.number1:
                screentext.setText(screentext.getText() + "1");
                break;
            case R.id.number2:
                screentext.setText(screentext.getText() + "2");
                break;
            case R.id.number3:
                screentext.setText(screentext.getText() + "3");
                break;
            case R.id.number4:
                screentext.setText(screentext.getText() + "4");
                break;
            case R.id.number5:
                screentext.setText(screentext.getText() + "5");
                break;
            case R.id.number6:
                screentext.setText(screentext.getText() + "6");
                break;
            case R.id.number7:
                screentext.setText(screentext.getText() + "7");
                break;
            case R.id.number8:
                screentext.setText(screentext.getText() + "8");
                break;
            case R.id.number9:
                screentext.setText(screentext.getText() + "9");
                break;
            case R.id.dot:
                screentext.setText(screentext.getText() + ".");
                break;
            case R.id.multiply:
                screentext.setText(screentext.getText() + "×");
                break;
            case R.id.subtract:
                screentext.setText(screentext.getText() + "-");
                break;
            case R.id.add:
                screentext.setText(screentext.getText()+"+");
                break;
            case R.id.Cosine:
                screentext.setText(screentext.getText()+"cos");
                break;
            case R.id.Sine:
                screentext.setText(screentext.getText()+"sin");
                break;
            case R.id.tangent:
                screentext.setText(screentext.getText()+"tan");
                break;
            case R.id.pie:
                screentext.setText(screentext.getText()+pi);
                break;
            case R.id.openbracket:
                screentext.setText(screentext.getText()+"(");
                break;
            case R.id.closebracket:
                screentext.setText(screentext.getText()+")");
                break;
            case R.id.log:
                screentext.setText(screentext.getText()+"log");
                break;
            case R.id.naturallog:
                screentext.setText(screentext.getText()+"ln");
                break;
            case R.id.exclamation:
                int vall = Integer.parseInt(screentext.getText().toString());
                int fact = factorial(vall);
                screentext.setText(String.valueOf(fact));
                break;
            case R.id.squareroot:
                String val1 = screentext.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val1));
                screentext.setText(String.valueOf(r));
                break;
            case R.id.percentage:
                screentext.setText(screentext.getText() + "%");
                break;
            case R.id.inverse:
                screentext.setText(screentext.getText() + "^" + "(-1)");
                break;
            case R.id.raisetopower:
                screentext.setText(screentext.getText() + "^");
                break;
            case R.id.Rad:
                screentext.setText(screentext.getText() + "rad");
                break;
            case R.id.e:
                screentext.setText(screentext.getText()+"exp");
                break;
            case R.id.equal:
                String valeq = screentext.getText().toString();
                String replacedstr = valeq.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                screentext.setText(String.valueOf(result));
        }
    }
    int factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }
    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}