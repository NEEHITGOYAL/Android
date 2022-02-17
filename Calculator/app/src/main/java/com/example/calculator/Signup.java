package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity implements View.OnClickListener{
    EditText name,username,password,repeatPassword;
    RadioGroup radiogroup;
    RadioButton radioButtonMale;
    RadioButton radioButtonFemale;
    TextView Signuptologin;
    Button signupSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Signuptologin = findViewById(R.id.signuplogin);
        name = findViewById(R.id.signupName);
        username = findViewById(R.id.signupusername);
        password = findViewById(R.id.signuppassword1);
        repeatPassword = findViewById(R.id.signuppassword2);
        radiogroup = findViewById(R.id.radioGroup);
        radioButtonMale = findViewById(R.id.radioMale);
        radioButtonFemale = findViewById(R.id.radioFemale);
        signupSubmit = (Button) findViewById(R.id.SignupButton);
        String text = Signuptologin.getText().toString();
        SpannableString linktologin = new SpannableString(text);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                Toast.makeText(Signup.this,"Move to Login",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };
        linktologin.setSpan(clickableSpan,26,31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        Signuptologin.setText(linktologin);
        Signuptologin.setMovementMethod(LinkMovementMethod.getInstance());
        signupSubmit.setOnClickListener(this);
    }
    boolean checkName(){
        if(TextUtils.isEmpty(name.getText())) {
            name.setError("name is required");
            return false;}
        else{
            name.setError(null);
            return true;
        }
    }
    boolean checkUsername(){
        if(TextUtils.isEmpty(username.getText())) {
            username.setError("username is required");
            return false;}
        else{
            username.setError(null);
            return true;
        }
    }
    boolean checkPassword(){
        String pass = password.getText().toString();
        String pass2 = repeatPassword.getText().toString();
        if(TextUtils.isEmpty(password.getText())) {
            password.setError("password is required");
            return false;}
        else if(!pass.equals(pass2)) {
            password.setError(null);
            repeatPassword.setError("Password doesn't match");
            return false;
        }
        else{
            repeatPassword.setError(null);
            return true;
        }
    }
    boolean checkRadiobutton(){
        if(radiogroup.getCheckedRadioButtonId() == -1){
            radioButtonFemale.setError("Please select  any one");
            radioButtonMale.setError("Please select  any one");
            return false;
        }
        else{
            radioButtonFemale.setError(null);
            radioButtonMale.setError(null);
            return true;
        }
    }

    @Override
    public void onClick(View view) {
        if(checkName() | checkUsername() | checkRadiobutton() | checkPassword()){
            SharedPreferences shrd = getSharedPreferences(username.getText().toString(), MODE_PRIVATE);
            SharedPreferences.Editor editor = shrd.edit();

            editor.putString("name", name.getText().toString());
            editor.putString("username", username.getText().toString());
            editor.putString("password", password.getText().toString());
            editor.putString("gender",(radioButtonMale.isChecked()) ? "male":"female");
            editor.apply();
            Toast.makeText(Signup.this,"Saved Details",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),Login.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(Signup.this,"Not okay",Toast.LENGTH_SHORT).show();
        }
    }
}