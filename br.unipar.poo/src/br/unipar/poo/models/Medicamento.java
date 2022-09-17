package br.unipar.poo.models;

public class Medicamento {

    private int id;
    private String nome;
    private int qtnMedic;
    private String dtVencimento;
    private Double vlMedicamento;

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

    public int getQtnMedic() {
        return qtnMedic;
    }

    public void setQtnMedic(int qtnMedic) {
        this.qtnMedic = qtnMedic;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Double getVlMedicamento() {
        return vlMedicamento;
    }

    public void setVlMedicamento(Double vlMedicamento) {
        this.vlMedicamento = vlMedicamento;
    }

    public Medicamento(int id, String nome, int qtnMedic, String dtVencimento, Double vlMedicamento) {
        this.id = id;
        this.nome = nome;
        this.qtnMedic = qtnMedic;
        this.dtVencimento = dtVencimento;
        this.vlMedicamento = vlMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nome=" + nome + ", qtnMedic=" + qtnMedic + ", dtVencimento=" + dtVencimento + ", vlMedicamento=" + vlMedicamento + '}';
    }

}
