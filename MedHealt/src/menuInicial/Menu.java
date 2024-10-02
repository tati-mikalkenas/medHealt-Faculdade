package menuInicial;

import model.Agendamento;
import model.Consultas;
import model.Emergencia;

import java.util.Scanner;

public class Menu {
    private String nome;
    Scanner sc = new Scanner(System.in);
    Integer res;
    Agendamento consultaAgendamentos = new Agendamento();
    Consultas agendarConsulta = new Consultas();
    Emergencia emergencia = new Emergencia();

    public Menu(String nome){
        this.nome = nome;
    }

    public void opcoesMenu(){
        System.out.println("Olá, " + nome + ". O que deseja fazer? \n"
                + "1-Ver meus agendamentos. \n"
                + "2-Agendar consulta \n"
                + "3-Emergência \n"
                + "4- Sair");
        res = sc.nextInt();
        escolherOpcaoMenu();
    }

    public void escolherOpcaoMenu(){
        switch (res){
            case 1:
                System.out.println("Você escolheu ver seus agendamentos, aqui estão eles:");
                consultaAgendamentos.agendamentosFeitos();
                System.out.println("Deseja voltar ao menu principal?");
                voltaAoMenuPrincipal();
                break;
            case 2:
                System.out.println("Você escolheu agendar uma consulta");
                agendarConsulta.escolherEspecialidade(sc);
                System.out.println("Deseja voltar ao menu principal?");
                voltaAoMenuPrincipal();
                break;
            case 3:
                System.out.println("Você escolheu realizar uma consulta de emergência");
                emergencia.especialistaDisponivel();
                System.out.println("Deseja voltar ao menu principal?");
                voltaAoMenuPrincipal();
                break;
            case 4:
                System.out.println("Finalizando sua sessão. Obrigada!!");
            default:
                System.out.println("Por favor, escolha uma opção para continuarmos!");
        }
    }

    public void voltaAoMenuPrincipal(){
        String voltaAoMenu = sc.nextLine();
        if(voltaAoMenu.equalsIgnoreCase("Sim")){
            opcoesMenu();
        } else {
            System.out.println("Finalizando sua sessão. Obrigada!!");
        }
    }

}
