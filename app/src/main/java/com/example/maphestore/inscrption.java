package com.example.maphestore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inscrption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscrption);
    }

    public void nextPage (View view){
        Intent f = new Intent(this, aceptacion.class);
        startActivity(f);
    }
}