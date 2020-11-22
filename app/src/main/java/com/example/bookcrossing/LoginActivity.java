package com.example.bookcrossing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity
{
    String login = "admin", email, name, password = "admin";
    EditText obj_aut_login, obj_aut_password;
    TextView obj_input_error;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_screen);
    }

    public void EnterButton(View view)
    {
        setContentView(R.layout.authorization_screen);

        obj_input_error = (TextView)findViewById(R.id.invalid_input);
        obj_input_error.setVisibility(View.INVISIBLE);

        obj_aut_login = (EditText)findViewById(R.id.editTextTextEmailAddress);
        obj_aut_password = (EditText)findViewById(R.id.editTextTextPassword);
    }

    public void enterMain(View view)
    {
        if (obj_aut_login.getText().toString().equals(login) && obj_aut_password.getText().toString().equals(password))
        {
            android.content.Intent intent = new android.content.Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Log.d("STATE", obj_aut_login.getText().toString());
            Log.d("STATE", obj_aut_password.getText().toString());

            obj_input_error.setVisibility(View.VISIBLE);
        }
    }

    EditText obj_reg_login, obj_reg_name, obj_reg_email, obj_reg_password, obj_reg_repeat_password;
    TextView error_passwords_not_equal;

    public void newAccount(View view)
    {
        setContentView(R.layout.registration_screen);

        error_passwords_not_equal = (TextView)findViewById(R.id.textView3);
        error_passwords_not_equal.setVisibility(View.INVISIBLE);

        obj_reg_login = (EditText)findViewById(R.id.editTextTextEmailAddress2);
        obj_reg_name = (EditText)findViewById(R.id.editTextTextPersonName4);
        obj_reg_email = (EditText)findViewById(R.id.editTextTextPersonName3);
        obj_reg_password = (EditText)findViewById(R.id.editTextTextPersonName2);
        obj_reg_repeat_password = (EditText)findViewById(R.id.editTextTextPersonName);
    }

    public void createAccount(View view)
    {
        if (obj_reg_password.getText().toString().equals(obj_reg_repeat_password.getText().toString()))
        {
            login = obj_reg_login.getText().toString();
            password = obj_reg_password.getText().toString();
            name = obj_reg_name.getText().toString();
            email = obj_reg_email.getText().toString();

            Log.d("STATE", login);
            Log.d("STATE", password);
            Log.d("STATE", name);
            Log.d("STATE", email);

            setContentView(R.layout.authorization_screen);
            obj_input_error.setVisibility(View.INVISIBLE);
        }
        else
        {

            error_passwords_not_equal.setVisibility(View.VISIBLE);
        }


    }



    public void getBack(View view) { setContentView(R.layout.authorization_screen); }



}