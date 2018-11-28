package com.example.diego.tentandoasorte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero (View view){

        TextView textResuldado = findViewById(R.id.textResultado);
        textResuldado.setText("O sorteado foi: ");

    }
}
