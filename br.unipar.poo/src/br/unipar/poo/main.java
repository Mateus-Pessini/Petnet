
package br.unipar.poo;

import br.unipar.poo.models.Animal;
import br.unipar.poo.models.Cidade;
import br.unipar.poo.models.Endereco;
import br.unipar.poo.models.Estado;
import br.unipar.poo.models.Exame;
import br.unipar.poo.models.Pais;
import br.unipar.poo.models.Proprietario;

public class main {

    public static void main(String[] args) {
        

        Pais pais = new Pais(1, "Brasil");
        Estado estado = new Estado(1, "Paraná", pais);
        Cidade cidade1 = new Cidade(2, "Palotina", estado);
        Endereco endereco1 = new Endereco("Rua Bento Alcides Vargas", 1, cidade1, 2);
        Endereco endereco2 = new Endereco("Rua Paranaue", 1, cidade1, 2);
        Proprietario proprietario1 = new Proprietario("585.837.370-45", 1, "Kaua Pessini Sito", "(45)99808-7706", "07/06/2003", endereco1);
        Proprietario proprietario2 = new Proprietario("583.834.375-45", 1, "José Reis Scherer", "(45)94508-7676", "13/10/2002", endereco2);
        Animal gato = new Animal(1, "Bob", 10, 10.5, proprietario1, false, "");
        Animal cachorro = new Animal(2, "Kauau", 8, 12.5, proprietario2, true, "12/05/2023");
        Exame raiox = new Exame(1, "Radio X", 599.99);
       

     
       //criar 2exames
       //criar 2 medicamentso
       //criar 2 vacinas
       //criar medico
       //criar funcionario
       //criar consulta
       //criar banho e 
       
        
    }

}
