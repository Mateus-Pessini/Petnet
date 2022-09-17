package br.unipar.poo.models;

public class Medico extends Pessoa {

    private String crm;
    private boolean disponivel;



    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Medico(String crm, boolean disponivel, int id, String nome, String telefone, String dtNasc, Endereco endereco) {
        super(id, nome, telefone, dtNasc, endereco);
        this.crm = crm;
        this.disponivel = disponivel;
    }
    
    @Override
    public String toString() {
        return "Medico{" + "nome=" + super.getNome() + ", telefone=" + super.getTelefone() + ", dtNasc=" + getDtNasc() + ", endereco=" + getEndereco() + ", id= "+ super.getId() + ", crm=" + crm + ", disponivel=" + disponivel +'}';
    }

}
