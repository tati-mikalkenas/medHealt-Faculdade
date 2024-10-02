package model;

import java.util.Scanner;

public class Consultas {

    EspecialidadesMedicas especialidades = new EspecialidadesMedicas();

    public void escolherEspecialidade(Scanner sc) {
        especialidades.adicionaEspecialidades();
        System.out.println("Deseja marcar consulta com qual especialista?");
        sc.nextLine();
        String resposta = sc.nextLine();
        System.out.println("Você selecionou: " + resposta + "! Essas são as datas disponíveis:");
        especialidades.disponibilidadeEspecialista(resposta, sc);
    }
}

