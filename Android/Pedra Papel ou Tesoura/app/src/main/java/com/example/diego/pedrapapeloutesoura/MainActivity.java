package com.example.diego.pedrapapeloutesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra (View view){
        this.opcaoSelecionada("pedra");

    }
    public void selecionarPapel (View view){
        this.opcaoSelecionada("papel");

    }

    public void selecionarTesoura (View view){
        this.opcaoSelecionada("tesoura");

    }

    public void opcaoSelecionada(String escolhaDoUsuario){

        ImageView imagem_opcao_app = findViewById(R.id.imagem_opcao_app);
        TextView textoResultado =  findViewById(R.id.text_resultado);

        // Gerar numero aleatorio para a escolha do App
        String[] opcoes = {"pedra","papel","tesoura"};
        int numero = new Random().nextInt(3);
        String escolhadoApp = opcoes[numero];

        switch (escolhadoApp) {
            case "pedra" :
                imagem_opcao_app.setImageResource(R.drawable.pedra);
                break;
            case "papel" :
                imagem_opcao_app.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagem_opcao_app.setImageResource(R.drawable.tesoura);
                break;

        }

        if (
                (escolhadoApp == "pedra" && escolhaDoUsuario == "tesoura") ||
                (escolhadoApp == "papel" && escolhaDoUsuario == "pedra")||
                (escolhadoApp == "tesoura" && escolhaDoUsuario == "papel"))
        {//ganhou
            textoResultado.setText("Voce perdeu :(");

        } else if (
                (escolhaDoUsuario == "pedra" && escolhadoApp == "tesoura") ||
                (escolhaDoUsuario == "papel" && escolhadoApp == "pedra")||
                (escolhaDoUsuario == "tesoura" && escolhadoApp == "papel"))
        {//perdeu
            textoResultado.setText("Voce GANHOU :)");


        }else{
        // empatou
            textoResultado.setText("Empatamos ;)");


        }




    }
}
