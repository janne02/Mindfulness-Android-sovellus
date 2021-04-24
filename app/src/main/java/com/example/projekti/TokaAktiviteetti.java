package com.example.projekti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TokaAktiviteetti extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toka_aktiviteetti);
    }

    // siirtyy seuraavaan aktiviteettiin
    public void seuraavaButton(View view) {
        Intent goBack = new
                Intent(TokaAktiviteetti.this, KolmasAktiviteetti.class);
        startActivity(goBack);
    }

    // palaa takaisin aikasempaan aktiviteettiin
    public void returnButton(View view) {
        Intent goBack = new
                Intent(TokaAktiviteetti.this, MainActivity.class);
        startActivity(goBack);
    }
    //valitsit hyvän fiiliksen joten laitamme sinut tekemään hyvä fiiliksisen tehtäviä
}