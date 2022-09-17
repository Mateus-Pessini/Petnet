package br.unipar.poo.models;

public class Pessoa {
    private int id;
    private String nome;
    private String telefone;
    private String dtNasc;
    private Endereco endereco;

   
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa(int id, String nome, String telefone, String dtNasc, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.dtNasc = dtNasc;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", dtNasc=" + dtNasc + ", endereco=" + endereco + '}';
    }

    
    
    
    
}