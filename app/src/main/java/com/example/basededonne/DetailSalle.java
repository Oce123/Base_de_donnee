package com.example.basededonne;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailSalle extends AppCompatActivity {

    EditText numero, heure;
    Button mod, sup;
    String id;
    Helper h = new Helper(DetailSalle.this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_salle);

        numero = findViewById(R.id.numero_);
        heure = findViewById(R.id.heure_);
        mod = findViewById(R.id.mod);
        sup = findViewById(R.id.sup);
        id = getIntent().getStringExtra("id");

        Salle_disponible s = h.getOneSalle(Integer.parseInt(id));
        numero.setText(s.getNumero());
        heure.setText(String.valueOf(s.getHeure()));

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Salle_disponible sd = new Salle_disponible(Integer.parseInt(id),numero.getText().toString(), Double.parseDouble(heure.getText().toString()));
            }
        });
    }
}