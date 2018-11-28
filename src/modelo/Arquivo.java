package modelo;

public class Arquivo {

    String nome;
    String status = "untracked";
    String tipo;
    String conteudo;
    boolean editado = false;
    boolean removido = false;

    Arquivo(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    void editar(String novo){
        this.conteudo = novo;
        this.editado = true;
    }

    void add(){
        this.status = "Stage Area";
    }

    void reset(){
        this.editado = false;
        this.status = status;
    }


}
