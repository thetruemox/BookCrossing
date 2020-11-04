package com.example.bookcrossing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_screen);
    }

    public void EnterButton(View view) {
        setContentView(R.layout.authorization_screen);
    }
    public void newAccount(View view) {
        setContentView(R.layout.registration_screen);
    }
    public void getBack(View view) { setContentView(R.layout.authorization_screen); }
    public void createAccount(View view) {setContentView(R.layout.authorization_screen); }
    public void enterMain(View view)
    {
        android.content.Intent intent= new android.content.Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }

}