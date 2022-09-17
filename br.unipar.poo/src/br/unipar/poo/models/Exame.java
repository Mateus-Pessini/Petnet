package br.unipar.poo.models;

public class Exame {
    private String nomeExame;
    private Double vlExame;

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

    public Exame(String nomeExame, Double vlExame) {
        this.nomeExame = nomeExame;
        this.vlExame = vlExame;
    }
    
    
}