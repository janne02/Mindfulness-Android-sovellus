package com.example.projekti;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.app.UiModeManager;


public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private Button buttonConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextUsername = findViewById(R.id.name);
        buttonConfirm = findViewById(R.id.button);

        editTextUsername.addTextChangedListener(loginTextWatcher);
        editTextUsername = findViewById(R.id.name);
        buttonConfirm = findViewById(R.id.button);

        editTextUsername.addTextChangedListener(loginTextWatcher);


    }


    // Katsoo onko käyttäjä syöttänyt nimensä, jos ei niin silloin ei voi jatkaa
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String usernameInput = editTextUsername.getText().toString().trim();

            buttonConfirm.setEnabled(!usernameInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
    // Tässä siirrymme seuraavaan aktiviteettiin
        public void seuraavaButton(View view) {
            Intent goNext = new
                    Intent(MainActivity.this, TokaAktiviteetti.class);
            startActivity(goNext);
        }
    }

