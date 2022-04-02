package com.example.loginapp;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button enter_button;
    Button registration_button;

    View.OnClickListener yes = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.enter_button:
                    showMessage("Нажата кнопка Входа");
                    break;
                case R.id.registration_button:
                    // showMessage("Нажата кнопка Регистриции");
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter_button = (Button) findViewById(R.id.enter_button);
        enter_button.setOnClickListener(yes);

        registration_button = (Button) findViewById(R.id.registration_button);
        registration_button.setOnClickListener(yes);
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}