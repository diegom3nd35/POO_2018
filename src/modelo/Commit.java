package modelo;

public class Commit {
    String mensagem;
    int quantidadeArtigo;

    Commit(String message){
        this.mensagem = message;
    }

    void commitar(Arquivo arquivo){
        arquivo.status = "Commited";
    }
}

