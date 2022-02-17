package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private EditText loginUsername,loginPassword;
    private TextView signup;
    private Button loginButton;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup = findViewById(R.id.loginsignup);
        loginButton = (Button) findViewById(R.id.LoginButton);
        loginPassword = (EditText) findViewById(R.id.Loginpassword);
        loginUsername = (EditText) findViewById(R.id.Loginusername);
        String text = signup.getText().toString();
        SpannableString linktosignup = new SpannableString(text);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(getApplicationContext(),Signup.class);
                startActivity(intent);
                Toast.makeText(Login.this,"Move to signup",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };
        linktosignup.setSpan(clickableSpan,10,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        signup.setText(linktosignup);
        signup.setMovementMethod(LinkMovementMethod.getInstance());
        loginButton.setOnClickListener(this);
    }
    boolean checkUsername(){
        if(TextUtils.isEmpty(loginUsername.getText())) {
            loginUsername.setError("username is required");
            return false;}
        else{
            loginUsername.setError(null);
            return true;
        }
    }
    boolean checkPassword(){
        if(TextUtils.isEmpty(loginPassword.getText())) {
            loginPassword.setError("Password is required");
            return false;}
        else{
            loginPassword.setError(null);
            return true;
        }
    }
    @Override
    public void onClick(View view) {
        if(checkUsername() & checkPassword()){
            SharedPreferences getShared = getSharedPreferences(loginUsername.getText().toString(), MODE_PRIVATE);
            String value_password = getShared.getString("password",null);
            String value_name = getShared.getString("name",null);
            if(value_password == null) {
                Toast.makeText(Login.this,"User Doesn't Exists",Toast.LENGTH_SHORT).show();}
            else if(!value_password.equals(loginPassword.getText().toString())){
                Toast.makeText(Login.this,"Wrong Password",Toast.LENGTH_SHORT).show();}
            else{
                Toast.makeText(Login.this,"Login Successful",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("name",value_name);
                startActivity(intent);
            }
        }
        else{
            Toast.makeText(Login.this,"Enter Complete Details",Toast.LENGTH_SHORT).show();
        }
    }
}