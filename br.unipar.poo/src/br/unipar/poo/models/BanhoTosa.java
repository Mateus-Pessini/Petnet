package br.unipar.poo.models;

public class BanhoTosa {
    private int id;
    private Animal animal;
    private Funcionario funcionario;
    private String dtMarcada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDtMarcada() {
        return dtMarcada;
    }

    public void setDtMarcada(String dtMarcada) {
        this.dtMarcada = dtMarcada;
    }

    public BanhoTosa(int id, Animal animal, Funcionario funcionario, String dtMarcada) {
        this.id = id;
        this.animal = animal;
        this.funcionario = funcionario;
        this.dtMarcada = dtMarcada;
    }

    @Override
    public String toString() {
        return "BanhoTosa{" + "id=" + id + ", animal=" + animal + ", funcionario=" + funcionario + ", dtMarcada=" + dtMarcada + '}';
    }
    
}