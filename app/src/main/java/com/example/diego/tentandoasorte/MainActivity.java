package com.example.diego.tentandoasorte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero (View view){

        // atribuindo a textView "texResultado" a variavel "sorteado"
        TextView sorteado = findViewById(R.id.textResultado);

        // gera um numero X aleatorio inteiro
        int x = new Random().nextInt(10);

        // setA o numero sorteado e uma msg a variavel "sorteado" que é a texResultado
        sorteado.setText("O sorteado foi: "+ x);
    }
}
