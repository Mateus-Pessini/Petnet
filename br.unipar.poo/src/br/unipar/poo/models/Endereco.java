package br.unipar.poo.models;

public class Endereco {
    private String nome;
    private int id;
    private Cidade cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Endereco(String nome, int id, Cidade cidade) {
        this.nome = nome;
        this.id = id;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nome=" + nome + ", id=" + id + ", cidade=" + cidade + '}';
    }
    
    
}