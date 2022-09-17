package br.unipar.poo.models;

public class Funcionario extends Pessoa{
    private String cpf;
    private String matricula;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Funcionario(String cpf, int id, String matricula, String nome, String telefone, String dtNasc, Endereco endereco) {
        super(id, nome, telefone, dtNasc, endereco);
        this.cpf = cpf;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionário{" + "nome=" + super.getNome() + ", telefone=" + super.getTelefone() + ", dtNasc=" + getDtNasc() + ", endereco=" + getEndereco() + ", id= "+ super.getId() + ", cpf=" + cpf + ", matricula= "+ matricula +'}';
    }

    
    
    
}