package com.example.calculette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    /**
     * Declaration des pointeurs
     */
    private EditText txtNb1, txtNb2,txtResultat;
    private Button btnCalcul;
    Double nombre1, nombre2, somme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * ces instanciations servent a lier les widjet au mainActivity
         */
        txtNb1 = findViewById(R.id.txtNb1);
        txtNb2 =  findViewById(R.id.txtNb2);
        txtResultat = findViewById(R.id.txtResultat);
        btnCalcul =  findViewById(R.id.btnCalcul);
        /**
         * rattacher l'ecouteur sur le boutons
         */
        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre1 = Double.parseDouble(txtNb1.getText().toString());
                nombre2 = Double.parseDouble(txtNb2.getText().toString());
                somme = nombre1 + nombre2;
                txtResultat.setText(Double.toString(somme));
            }
        });
    }
}

