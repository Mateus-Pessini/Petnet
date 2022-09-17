package br.unipar.poo;

import br.unipar.poo.models.Animal;
import br.unipar.poo.models.BanhoTosa;
import br.unipar.poo.models.Cidade;
import br.unipar.poo.models.Consulta;
import br.unipar.poo.models.Endereco;
import br.unipar.poo.models.Estado;
import br.unipar.poo.models.Exame;
import br.unipar.poo.models.Funcionario;
import br.unipar.poo.models.Medicamento;
import br.unipar.poo.models.Medico;
import br.unipar.poo.models.Pais;
import br.unipar.poo.models.Proprietario;
import br.unipar.poo.models.Vacina;

public class main {

    public static void main(String[] args) {

        Pais pais = new Pais(1, "Brasil");
        Estado estado = new Estado(1, "Paraná", pais);
        Cidade cidade1 = new Cidade(2, "Palotina", estado);
        Endereco endereco1 = new Endereco("Rua Bento Alcides Vargas", 1, cidade1, 2223);
        Endereco endereco2 = new Endereco("Rua Paranaue", 2, cidade1, 2224);
        Endereco endereco3 = new Endereco("Rua 25 de Dezeembro", 3, cidade1, 2225);
        Endereco endereco4 = new Endereco("Rua Thanos", 4, cidade1, 2226);
        Endereco endereco5 = new Endereco("Rua Pindotiporã", 5, cidade1, 1555);
        Proprietario proprietario1 = new Proprietario("585.837.370-45", 1, "Kaua Pessini Sito", "(44)99808-7706", "07/06/2003", endereco1);
        Proprietario proprietario2 = new Proprietario("583.834.375-45", 1, "José Reis Scherer", "(44)94508-7676", "13/10/2002", endereco2);
        Animal gato = new Animal(1, "Bob", 10, 10.5, proprietario1, false, "");
        Animal cachorro = new Animal(2, "Caramelo", 8, 12.5, proprietario2, true, "17/10/2022");
        Exame raiox = new Exame(1, "Radio X", 599.99);
        Exame castracao = new Exame(2, "Castração", 799.99);
        Medicamento paracetamal = new Medicamento(1, "paracetamal", 5, "06/06/2026", 69.0);
        Medicamento plasil = new Medicamento(2, "plasil", 10, "25/05/2024", 420.0);
        Medicamento cetoprofeno = new Medicamento(3, "Cetoprofeno", 20, "10/08/2027", 625.0);
        Medico medico1 = new Medico("646442069", true, 1, "Dr Scherer", "(44)96987-8799", "12/04/1980", endereco3);
        Medico medico2 = new Medico("254896513", false, 2, "Dr Reis", "(44)99645-0796", "15/09/1990", endereco4);
        Medico medico3 = new Medico("865419785", true, 3, "Dr Sito", "(44)99465-0123", "10/05/1985", endereco5);
        Funcionario funcionario1 = new Funcionario("062.966.366-48", 1, "649216", "Mateus Martins Siqueira", "(44) 99808-7606", "13/03/1991", endereco4);
        Vacina vacina1 = new Vacina(1, "Raiva", 1, "25/05/2025", 795.99);
        Vacina vacina2 = new Vacina(1, "Tetano canino", 2, "12/06/2024", 595.95);
        Consulta consulta = new Consulta(medico1, proprietario2, gato, "17/09/2022", 1795.5);
        consulta.getListExame().add(raiox);
        consulta.getListMedicamento().add(plasil);
        consulta.getListMedicamento().add(paracetamal);
        consulta.getListVacina().add(vacina1);
        consulta.calculaVlTotal();

        BanhoTosa banhotosa = new BanhoTosa(1, cachorro, funcionario1, "18/09/2022");
        banhotosa.banho();

        System.out.println(consulta.toString());
        System.out.println(banhotosa.toString());

    }

}
