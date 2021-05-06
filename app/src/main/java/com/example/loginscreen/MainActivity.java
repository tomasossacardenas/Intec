package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usernameLogin, passwordLogin;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameLogin = findViewById(R.id.emailSignUp);
        passwordLogin = findViewById(R.id.phoneSignUp);
        buttonLogin = findViewById(R.id.buttonLogin);
    }
}