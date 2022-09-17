package br.unipar.poo.models;

public class Exame {

    private int id;
    private String nomeExame;
    private Double vlExame;

    public Exame(int id, String nomeExame, Double vlExame) {
        this.id = id;
        this.nomeExame = nomeExame;
        this.vlExame = vlExame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public Double getVlExame() {
        return vlExame;
    }

    public void setVlExame(Double vlExame) {
        this.vlExame = vlExame;
    }

    @Override
    public String toString() {
        return "Exame{" + "id=" + id + ", nomeExame=" + nomeExame + ", vlExame=" + vlExame + '}';
    }

}
