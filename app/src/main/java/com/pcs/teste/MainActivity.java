package com.pcs.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView escanear = findViewById(R.id.escanear);

        escanear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        ImageView analise = findViewById(R.id.analise);

        analise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(MainActivity.this, Analise_de_Consumo.class));
            }
        });

        ImageView stock = findViewById(R.id.stock);

        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(MainActivity.this, MainActivity3.class));
            }
        });

        ImageView resgates = findViewById(R.id.resgates);

        resgates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(MainActivity.this, Resgates.class));
            }
        });

        ImageView menu = findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(MainActivity.this, Menu.class));
            }
        });

        ImageView notificacoes = findViewById(R.id.notificacoes);

        notificacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(MainActivity.this, Notificacoes.class));
            }
        });

        ImageView pesquisa = findViewById(R.id.procura);

        pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(MainActivity.this, Pesquisa.class));
            }
        });


    }
}

