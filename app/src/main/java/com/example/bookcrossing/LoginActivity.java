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
    TextView aut_error;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_screen);
    }

    private void show_error(TextView obj, String error_text)
    {
        obj.setText(error_text);
        obj.setVisibility(View.VISIBLE);
    }

    public void EnterButton(View view)
    {
        setContentView(R.layout.authorization_screen);

        aut_error = (TextView)findViewById(R.id.invalid_input);
        aut_error.setVisibility(View.INVISIBLE);

        obj_aut_login = (EditText)findViewById(R.id.editTextTextEmailAddress);
        obj_aut_password = (EditText)findViewById(R.id.editTextTextPassword);
    }

    public void enterMain(View view)
    {
        if (obj_aut_login.getText().toString().isEmpty() || obj_aut_password.getText().toString().isEmpty())
        {
            show_error(aut_error, "Не все поля заполнены!");
            return;
        }

        if (obj_aut_login.getText().toString().equals(this.login) && obj_aut_password.getText().toString().equals(this.password))
        {
            android.content.Intent intent = new android.content.Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            return;
        }
        else
        {
            Log.d("STATE", "obj login = " + obj_aut_login.getText().toString());
            Log.d("STATE", "obj pass = " + obj_aut_password.getText().toString());

            Log.d("STATE", "var login = " + this.login);
            Log.d("STATE", "var pass = " + this.password);

            show_error(aut_error, "Неправильный логин или пароль!");

            return;
        }
    }

    EditText obj_reg_login, obj_reg_name, obj_reg_email, obj_reg_password, obj_reg_repeat_password;
    TextView reg_error;

    public void newAccount(View view)
    {
        setContentView(R.layout.registration_screen);

        reg_error = (TextView)findViewById(R.id.textView3);
        reg_error.setVisibility(View.INVISIBLE);

        obj_reg_login = (EditText)findViewById(R.id.editTextTextEmailAddress2);
        obj_reg_name = (EditText)findViewById(R.id.editTextTextPersonName4);
        obj_reg_email = (EditText)findViewById(R.id.editTextTextPersonName3);
        obj_reg_password = (EditText)findViewById(R.id.editTextTextPersonName2);
        obj_reg_repeat_password = (EditText)findViewById(R.id.editTextTextPersonName);
    }

    public void createAccount(View view)
    {
        if (obj_reg_password.getText().toString().isEmpty() || obj_reg_email.getText().toString().isEmpty() || obj_reg_name.getText().toString().isEmpty() || obj_reg_login.getText().toString().isEmpty())
        {
            show_error(reg_error, "Все поля должны быть заполнены!");
            return;
        }

        if (obj_reg_password.getText().toString().equals(obj_reg_repeat_password.getText().toString()))
        {
            login = obj_reg_login.getText().toString();
            password = obj_reg_password.getText().toString();
            name = obj_reg_name.getText().toString();
            email = obj_reg_email.getText().toString();

            setContentView(R.layout.authorization_screen);

            obj_aut_login = (EditText)findViewById(R.id.editTextTextEmailAddress);
            obj_aut_password = (EditText)findViewById(R.id.editTextTextPassword);

            aut_error = (TextView)findViewById(R.id.invalid_input);
            aut_error.setVisibility(View.INVISIBLE);

            return;
        }
        else
        {
            show_error(reg_error, "Пароли не совпадают!" );
            return;
        }


    }



    public void getBack(View view)
    {
        setContentView(R.layout.authorization_screen);
        obj_aut_login = (EditText)findViewById(R.id.editTextTextEmailAddress);
        obj_aut_password = (EditText)findViewById(R.id.editTextTextPassword);

        aut_error = (TextView)findViewById(R.id.invalid_input);
        aut_error.setVisibility(View.INVISIBLE);
    }



}