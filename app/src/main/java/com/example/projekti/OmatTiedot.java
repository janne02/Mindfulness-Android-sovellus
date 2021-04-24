package com.example.projekti;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class OmatTiedot extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omat_tiedot);
        TextView textView = findViewById(R.id.textView4);
        TextView textView1 = findViewById(R.id.textView5);
        SharedPreferences sharedPreferences = getSharedPreferences("Mykey", MODE_PRIVATE);
        String value = sharedPreferences.getString("value", "");
        String value1 = sharedPreferences.getString("value1", "");
        textView.setText("nimi: " + value);
        textView1.setText("ikä: " + value1);
    }


    // palaa takaisin aikasempaan aktiviteettiin
    public void returnButton(View view) {
        Intent goBack = new
                Intent(OmatTiedot.this, MeterActivity.class);
        startActivity(goBack);
    }

}