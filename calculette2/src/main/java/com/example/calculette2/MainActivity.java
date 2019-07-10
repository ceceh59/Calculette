package com.example.calculette2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,btnPlus,btnMoins,btnMulti,btnDiv,btnEgal,btnPoint,buttonC;
    private TextView txtResultat;
    private Double nombre1,nombre2;
    private String operateur,chaine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();
        listenerButton();
        nombre1 = 0.0;
        nombre2 = 0.0;
        chaine ="";

    }

    @Override
    public void onClick(View v) {


        if (v.equals(button0)) {
            Toast.makeText(this, "button0", Toast.LENGTH_LONG).show();
            chaine = chaine + "0";
            txtResultat.setText(chaine);
        }
        if (v.equals(button1)) {
            Toast.makeText(this, "button1", Toast.LENGTH_LONG).show();
            chaine = chaine + "1";
            txtResultat.setText(chaine);
        }
        if (v.equals(button2)) {
            Toast.makeText(this, "button2", Toast.LENGTH_LONG).show();
            chaine = chaine + "2";
            txtResultat.setText(chaine);
        }
        if (v.equals(button3)) {
            Toast.makeText(this, "button3", Toast.LENGTH_LONG).show();
            chaine = chaine + "3";
            txtResultat.setText(chaine);
        }
        if (v.equals(button4)) {
            Toast.makeText(this, "button4", Toast.LENGTH_LONG).show();
            chaine = chaine + "4";
            txtResultat.setText(chaine);
        }
        if (v.equals(button5)) {
            Toast.makeText(this, "button5", Toast.LENGTH_LONG).show();
            chaine = chaine + "5";
            txtResultat.setText(chaine);
        }
        if (v.equals(button6)) {
            Toast.makeText(this, "button6", Toast.LENGTH_LONG).show();
            chaine = chaine + "6";
            txtResultat.setText(chaine);
        }
        if (v.equals(button7)) {
            Toast.makeText(this, "button7", Toast.LENGTH_LONG).show();
            chaine = chaine + "7";
            txtResultat.setText(chaine);
        }
        if (v.equals(button8)) {
            Toast.makeText(this, "button8", Toast.LENGTH_LONG).show();
            chaine = chaine + "8";
            txtResultat.setText(chaine);
        }
        if (v.equals(button9)) {
            Toast.makeText(this, "button9", Toast.LENGTH_LONG).show();
            chaine = chaine + "9";
            txtResultat.setText(chaine);
        }
        if (v.equals(btnPlus)) {
            Toast.makeText(this, "btnPlus", Toast.LENGTH_LONG).show();
            operateur = "+";
            chaine = "";
            nombre1 = Double.parseDouble(txtResultat.getText().toString());

            txtResultat.setText(chaine);
        }
        if (v.equals(btnMoins)) {
            Toast.makeText(this, "btnMoins", Toast.LENGTH_LONG).show();
            operateur = "-";
            chaine = "";
            nombre1 = Double.parseDouble(txtResultat.getText().toString());

            txtResultat.setText(chaine);
        }
        if (v.equals(btnMulti)) {
            Toast.makeText(this, "btnMulti", Toast.LENGTH_LONG).show();
            operateur = "*";
            chaine = "";
            nombre1 = Double.parseDouble(txtResultat.getText().toString());

            txtResultat.setText(chaine);
        }
        if (v.equals(btnDiv)) {
            Toast.makeText(this, "btnDiv", Toast.LENGTH_LONG).show();
            operateur = "/";
            chaine = "";
            nombre1 = Double.parseDouble(txtResultat.getText().toString());

            txtResultat.setText(chaine);
        }
        if (v.equals(btnEgal)) {
            switch (operateur){
                case "+":
                    nombre2 = nombre1 + Double.parseDouble(chaine);
                    txtResultat.setText(Double.toString(nombre2));
                    break;
                case "-" :
                    nombre2 = nombre1 - Double.parseDouble(chaine);
                    txtResultat.setText(Double.toString(nombre2));
                    break;
                case "*" :
                    nombre2 = nombre1 * Double.parseDouble(chaine);
                    txtResultat.setText(Double.toString(nombre2));
                    break;
                case "/" :
                    nombre2 = nombre1 / Double.parseDouble(chaine);
                    txtResultat.setText(Double.toString(nombre2));
                    break;
                    default:
            }
            //Toast.makeText(this, "btnEgal", Toast.LENGTH_LONG).show();
            //operateur = "=";
            //chaine = "";
            //txtResultat.setText(chaine);
        }
        if (v.equals(buttonC)) {
            Toast.makeText(this, "buttonC", Toast.LENGTH_LONG).show();
            operateur = "";
            chaine = "";
            nombre1 = 0.0;
            nombre2 = 0.0;
            txtResultat.setText(chaine);
        }
        if (v.equals(btnPoint)) {
            Toast.makeText(this, "btnPoint", Toast.LENGTH_LONG).show();

            chaine = chaine +".";
            txtResultat.setText(chaine);

        }

    }    public void initButton() {

    button0 = findViewById(R.id.button0);
    button1 = findViewById(R.id.button1);
    button2 = findViewById(R.id.button2);
    button3 = findViewById(R.id.button3);
    button4 = findViewById(R.id.button4);
    button5 = findViewById(R.id.button5);
    button6 = findViewById(R.id.button6);
    button7 = findViewById(R.id.button7);
    button8 = findViewById(R.id.button8);
    button9 = findViewById(R.id.button9);

    btnPlus = findViewById(R.id.btnPlus);
    btnMoins = findViewById(R.id.btnMoins);
    btnMulti = findViewById(R.id.btnMulti);
    btnDiv = findViewById(R.id.btnDiv);
    btnEgal = findViewById(R.id.btnEgal);
    btnPoint = findViewById(R.id.btnPoint);
    buttonC = findViewById(R.id.buttonC);

    txtResultat = findViewById(R.id.txtResultat);
}

    public void listenerButton() {


        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);

        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        btnPlus.setOnClickListener(this);
        btnMoins.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMulti.setOnClickListener(this);

        buttonC.setOnClickListener(this);
        btnPoint.setOnClickListener(this);

        btnEgal.setOnClickListener(this);


    }

}
