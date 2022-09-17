package br.unipar.poo.models;

public class Animal {

    private int id;
    private String nome;
    private int idade;
    private Double peso;
    private Proprietario dono;
    private boolean vacinado;
    private String proximaDose;
    private boolean tosado = false;

    public Animal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean isTosa() {
        return tosado;
    }

    public void setTosa(boolean tosado) {
        this.tosado = tosado;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal(int id, String nome, int idade, Double peso, Proprietario dono, boolean vacinado, String proximaDose) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.dono = dono;
        this.vacinado = vacinado;
        this.proximaDose = proximaDose;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", dono=" + dono + ", vacinado=" + vacinado + ", proximaDose=" + proximaDose + ", tosado=" + tosado + '}';
    }

}
