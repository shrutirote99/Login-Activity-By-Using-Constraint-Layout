package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textView;
        EditText EdtTxt1,EdtTxt2;
        AppCompatButton BtnLogin;

        textView = findViewById(R.id.TxtLogin);
        EdtTxt1 = findViewById(R.id.EdtUser);
        EdtTxt2 = findViewById(R.id.EdtPass);
        BtnLogin = findViewById(R.id.BtnSignIn);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = EdtTxt1.getText().toString();
                String s1 = EdtTxt2.getText().toString();

                if (s.equals("Shruti")&&s1.equals("Shruti@123")){
                    textView.setText("Welcome " +s);

                }else {
                    textView.setText("Login Failed!");
                }

            }
        });
    }
}