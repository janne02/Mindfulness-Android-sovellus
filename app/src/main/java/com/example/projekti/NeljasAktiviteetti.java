package com.example.projekti;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NeljasAktiviteetti extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neljas_aktiviteetti);
    }
    // siirtyy seuraavaan aktiviteettiin
    public void seuraavaButton(View view) {
        Intent goNext =new
                Intent(NeljasAktiviteetti.this,ViimeinenAktiviteetti.class);
        startActivity(goNext);
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.dropdown, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    // palaa takaisin aikasempaan aktiviteettiin
    public void returnButton(View view) {
        Intent goBack =new
                Intent(NeljasAktiviteetti.this,KolmasAktiviteetti.class);
        startActivity(goBack);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        if (text.equals("Vaihda käyttäjää")) {
            Intent paavalikko = new Intent(NeljasAktiviteetti.this, MainActivity.class);
            startActivity(paavalikko);
        } else if(text.equals("Sulje sovellus")) {

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
