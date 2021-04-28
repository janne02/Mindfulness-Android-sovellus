package com.example.projekti;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MeterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);

    }
    // siirtyy seuraavaan aktiviteettiin


    //you chose positive feeling so we open negative activity
    public void MoodPositive(View view) {
        Intent goodMood = new Intent(MeterActivity.this, MoodPositive.class);
        startActivity(goodMood);
    }

    //you chose negative feeling so we open negative activity
    public void MoodNegative(View view) {
        Intent badMood = new
                Intent(MeterActivity.this, MoodNegative.class);
        startActivity(badMood);
    }

    //you chose neutral feeling so we open Neutral activity
    public void MoodNeutral(View view) {
        Intent goBack = new
                Intent(MeterActivity.this, MoodNeutral.class);
        startActivity(goBack);
    }

    // Opens ViewList activity which has all the users from the SQLLITE database as a listview
    public void ViewListContents(View view) {
        Intent tiedot = new
                Intent(MeterActivity.this, ViewListContents.class);
        startActivity(tiedot);
    }
}