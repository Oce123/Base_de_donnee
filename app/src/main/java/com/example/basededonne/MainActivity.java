package com.example.basededonne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

EditText numero, heure;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = findViewById(R.id.numero);
        heure = findViewById(R.id.heure);
        b = findViewById(R.id.ajouter);

        b.setOnClickListener(View.OnClickListener()
            @Override
            public void onClick(View view){

                Salle_disponible s = new Salle_disponible(numero.getText().toString(),Double.parseDouble(heure.getText().toString()));
            }

        );
    }
}