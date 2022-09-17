package br.unipar.poo.models;

public class Endereco {
    private String rua;
    private int id;
    private Cidade cidade;
    private int nr;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public Endereco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Endereco(String rua, int id, Cidade cidade, int nr) {
        this.rua = rua;
        this.id = id;
        this.cidade = cidade;
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", id=" + id + ", cidade=" + cidade + ", nr=" + nr + '}';
    }

  

   
    
}