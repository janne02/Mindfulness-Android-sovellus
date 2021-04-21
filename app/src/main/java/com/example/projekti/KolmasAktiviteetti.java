package com.example.projekti;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class KolmasAktiviteetti extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolmas_aktiviteetti);
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dropdown, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    // siirtyy seuraavaan aktiviteettiin
    public void seuraavaButton(View view) {
        Intent goNext =new
                Intent(KolmasAktiviteetti.this,NeljasAktiviteetti.class);
        startActivity(goNext);

    }

    // palaa takaisin aikasempaan aktiviteettiin
    public void returnButton(View view) {
        Intent goBack =new
                Intent(KolmasAktiviteetti.this,TokaAktiviteetti.class);
        startActivity(goBack);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        if (text.equals("Vaihda käyttäjää")) {
            Intent paavalikko = new Intent(KolmasAktiviteetti.this, MainActivity.class);
            startActivity(paavalikko);
        } else if(text.equals("Sulje sovellus")) {

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}