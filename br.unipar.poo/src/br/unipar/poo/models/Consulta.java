package br.unipar.poo.models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Consulta {

    private Medico medico;
    private Proprietario dono;
    private Animal animal;
    private ArrayList<Vacina> listVacina = new ArrayList<>();
    private ArrayList<Exame> listExame = new ArrayList<>();
    private ArrayList<Medicamento> listMedicamento = new ArrayList<>();
    private String dtConsulta;
    private Double vlExame = 0.0;
    private Double vlMedicamento = 0.0;
    private Double vlConsulta = 0.0;
    private Double vlVacina = 0.0;
    private Double vlTotal = 0.0;
    
    public Consulta(Medico medico, Proprietario dono, Animal animal, String dtConsulta,  Double vlConsulta) {
        this.medico = medico;
        this.dono = dono;
        this.animal = animal;
        this.dtConsulta = dtConsulta;
        this.vlConsulta = vlConsulta;
       
    }

    @Override
    public String toString() {
        return "Consulta{" + "medico=" + medico + ", dono=" + dono + ", animal=" + animal + ", listVacina=" + listVacina + ", listExame=" + listExame + ", listMedicamento=" + listMedicamento + ", dtConsulta=" + dtConsulta + ", vlExame=" + vlExame + ", vlMedicamento=" + vlMedicamento + ", vlConsulta=" + vlConsulta + ", vlVacina=" + vlVacina + ", vlTotal=" + vlTotal + '}';
    }

  
    public Double getVlExame() {
        return vlExame;
    }
    
    public void setVlExame(Double vlExame) {
        this.vlExame = vlExame;
    }
    
    public Double getVlMedicamento() {
        return vlMedicamento;
    }
    
    public void setVlMedicamento(Double vlMedicamento) {
        this.vlMedicamento = vlMedicamento;
    }
    
    public Double getVlConsulta() {
        return vlConsulta;
    }
    
    public void setVlConsulta(Double vlConsulta) {
        this.vlConsulta = vlConsulta;
    }
    
    public Double getVlTotal() {
        return vlTotal;
    }
    
    public void setVlTotal(Double vlTotal) {
        this.vlTotal = vlTotal;
    }
    
    public ArrayList<Exame> getListExame() {
        return listExame;
    }
    
    public void setListExame(ArrayList<Exame> listExame) {
        this.listExame = listExame;
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public Proprietario getDono() {
        return dono;
    }
    
    public void setDono(Proprietario dono) {
        this.dono = dono;
    }
    
    public Animal getAnimal() {
        return animal;
    }
    
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
    public ArrayList<Vacina> getListVacina() {
        return listVacina;
    }
    
    public void setListVacina(ArrayList<Vacina> listVacina) {
        this.listVacina = listVacina;
    }
    
    public Double getVlVacina() {
        return vlVacina;
    }
    
    public void setVlVacina(Double vlVacina) {
        this.vlVacina = vlVacina;
    }
    
    public String getDtConsulta() {
        return dtConsulta;
    }
    
    public void setDtConsulta(String dtConsulta) {
        this.dtConsulta = dtConsulta;
    }
    
    public ArrayList<Medicamento> getListMedicamento() {
        return listMedicamento;
    }
    
    public void setListMedicamento(ArrayList<Medicamento> listMedicamento) {
        this.listMedicamento = listMedicamento;
    }
    
    public Double calculaVlTotal() {
        
        for (int i = 0; i < listExame.size(); i++) {
            vlExame += listExame.get(i).getVlExame();
        }
        
        for (int i = 0; i < listMedicamento.size(); i++) {
            vlMedicamento += listMedicamento.get(i).getVlMedicamento();
        }
        
        for (int i = 0; i < listVacina.size(); i++) {
            vlVacina += listVacina.get(i).getVlVacina();
        }
        
        String aux = JOptionPane.showInputDialog("Digite a data da próxima dose da vacina");
        animal.setProximaDose(aux);
        
        vlTotal = vlConsulta + vlExame + vlMedicamento + vlVacina;
        
        return vlTotal;
    }
    
}
