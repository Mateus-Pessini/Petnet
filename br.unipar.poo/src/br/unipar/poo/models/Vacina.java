package br.unipar.poo.models;

public class Vacina {

    private int id;
    private String nome;
    private int qtnVacina;
    private String dtVencimento;
    private Double vlVacina;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtnVacina() {
        return qtnVacina;
    }

    public void setQtnVacina(int qtnVacina) {
        this.qtnVacina = qtnVacina;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Double getVlVacina() {
        return vlVacina;
    }

    public void setVlVacina(Double vlVacina) {
        this.vlVacina = vlVacina;
    }

    public Vacina(int id, String nome, int qtnVacina, String dtVencimento, Double vlVacina) {
        this.id = id;
        this.nome = nome;
        this.qtnVacina = qtnVacina;
        this.dtVencimento = dtVencimento;
        this.vlVacina = vlVacina;
    }

    @Override
    public String toString() {
        return "Vacina{" + "id=" + id + ", nome=" + nome + ", qtnVacina=" + qtnVacina + ", dtVencimento=" + dtVencimento + ", vlVacina=" + vlVacina + '}';
    }

}
