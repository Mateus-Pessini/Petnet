package br.unipar.poo.models;

public class Animal {
    private String nome;
    private int idade;
    private Double peso;
    private Proprietario dono;
    private boolean vacinado;
    private String proximaDose;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Proprietario getDono() {
        return dono;
    }

    public void setDono(Proprietario dono) {
        this.dono = dono;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public String getProximaDose() {
        return proximaDose;
    }

    public void setProximaDose(String proximaDose) {
        this.proximaDose = proximaDose;
    }

    public Animal(String nome, int idade, Proprietario dono, boolean vacinado, String proximaDose, Double peso) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
        this.vacinado = vacinado;
        this.proximaDose = proximaDose;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", idade=" + idade + ", dono=" + dono + ", vacinado=" + vacinado + ", proximaDose=" + proximaDose + '}';
    }
    
}