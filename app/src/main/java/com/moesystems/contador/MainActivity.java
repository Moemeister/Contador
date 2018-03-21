package com.moesystems.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnuno;
    private Button btndos;
    private Button btntres;
    private Button btncuatro;
    private Button btncinco;
    private Button btnseis;
    private Button btnreset;
    private TextView textCont;
    private TextView textCont2;
    private int puntos;
    private int puntos2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntos = 0;
        puntos2 = 0;
        textCont = findViewById(R.id.cont1);
        textCont2 = findViewById(R.id.cont2);
        btnuno = findViewById(R.id.btn_uno);
        btndos = findViewById(R.id.btn_dos);
        btntres = findViewById(R.id.btn_tres);
        btncuatro = findViewById(R.id.btn_cuatro);
        btncinco = findViewById(R.id.btn_cinco);
        btnseis = findViewById(R.id.btn_seis);
        btnreset = findViewById(R.id.btn_reset);
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntos++;
                textCont.setText(puntos+"");
            }
        });
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntos+=2;
                textCont.setText(puntos+"");
            }
        });
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntos+=3;
                textCont.setText(puntos+"");
            }
        });
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntos2++;
                textCont2.setText(puntos2+"");
            }
        });
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntos2+=2;
                textCont2.setText(puntos2+"");
            }
        });
        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntos2+=3;
                textCont2.setText(puntos2+"");
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntos=0;
                puntos2=0;
                textCont.setText(puntos+"");
                textCont2.setText(puntos2+"");
            }
        });
    }
}
