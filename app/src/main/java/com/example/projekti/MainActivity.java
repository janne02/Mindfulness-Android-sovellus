package com.example.projekti;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    EditText editTextUsername;
    EditText editTextAge;
    private Button buttonConfirm;
    private TextView textView;
    String prevStarted = "yes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.name);
        editTextAge = findViewById(R.id.age);
        //final EditText editTextAge = findViewById(R.id.age);

        editTextUsername.addTextChangedListener(loginTextWatcher);
        editTextAge.addTextChangedListener(loginTextWatcher);
        //final EditText editTextUsername = findViewById(R.id.name);
        buttonConfirm = findViewById(R.id.button);
        SharedPreferences sharedpreferences = getSharedPreferences(getString(R.string.app_name),
                Context.MODE_PRIVATE);
        if (!sharedpreferences.getBoolean(prevStarted, false)) {
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("Key", "Value");
            editor.putBoolean(prevStarted, Boolean.TRUE);
            editor.apply();
        } else {
            moveToMeterActivity();
        }
    }

    private void moveToMeterActivity() {
        Intent intent = new Intent(this, MeterActivity.class);
        //startActivity(intent);
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String usernameInput = editTextUsername.getText().toString().trim();
            String ageInput = editTextAge.getText().toString().trim();

            buttonConfirm.setEnabled(!usernameInput.isEmpty() && !ageInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {


            //

            buttonConfirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String value = editTextUsername.getText().toString().trim();
                    String value1 = editTextAge.getText().toString().trim();
                    SharedPreferences sharedPreferences = getSharedPreferences("Mykey", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("value", value);
                    editor.putString("value1", value1);
                    editor.apply();
                    Intent intent = new Intent(MainActivity.this, MeterActivity.class);
                    startActivity(intent);
                }
            });
        }


        // Tässä siirrymme seuraavaan aktiviteettiin
        public void seuraavaButton(View view) {


            Intent goNext = new

                    Intent(MainActivity.this, MeterActivity.class);

            startActivity(goNext);


        }
    };
}

