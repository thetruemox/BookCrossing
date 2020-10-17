package com.example.bookcrossing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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
    public void getBack(View view) {
        setContentView(R.layout.authorization_screen);
    }
}