package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agendamento {
    List<Double> agendamentosRealizados = new ArrayList<>();



    public void agendamentoCliente(Scanner sc,
                                   List<Double> especialista,
                                   String especialidade,
                                   Double horarioEscolhido) {
        System.out.println("Você escolheu o seguinte horário: " + horarioEscolhido + ", deseja confirmar?");
        sc.nextLine();
        sc.nextLine();
                switch (especialidade){
                    case "Clinico geral":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;

                    case "Cardiologista":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;

                    case "Dermatologista":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;

                    case "Oftalmologista":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;

                    case "Neurologista":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;

                    case "Ortopedista":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;

                    case "Gastroenterologista":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;

                    case "Otorrinolaringologista":
                        especialista.remove(horarioEscolhido);
                        System.out.println("Agendado ás: " + horarioEscolhido + "!");
                        agendamentosRealizados.add(horarioEscolhido);
                        agendamentosFeitos();
                        break;
                }
            }

        public void agendamentosFeitos() {
            if (agendamentosRealizados.size() >= 0) {
                for (Double agendamentos : agendamentosRealizados) {
                    System.out.println("Seus agendamentos até o momento: " + agendamentos);
                }
            } else {
                System.out.println("Você ainda não possui agendamentos! Marque agora sua consulta");
            }
        }

}

