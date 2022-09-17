package br.unipar.poo.models;

public class Proprietario extends Pessoa{
    
    private String cpf;



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Proprietario(String cpf, int id, String nome, String telefone, String dtNasc, Endereco endereco) {
        super(id, nome, telefone, dtNasc, endereco);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Proprietário{" + "nome=" + super.getNome() + ", telefone=" + super.getTelefone() + ", dtNasc=" + getDtNasc() + ", endereco=" + getEndereco() + ", id= "+ super.getId() + ", cpf=" + cpf + '}';
    }
    

    
}