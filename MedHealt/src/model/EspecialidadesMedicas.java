package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EspecialidadesMedicas {
    List<String> especialidades = new ArrayList<>();
    List<Double> horariosClinico = new ArrayList<>();
    List<Double> horariosCardiologista = new ArrayList<>();
    List<Double> horariosDermato = new ArrayList<>();
    List<Double> horariosOftalmo = new ArrayList<>();
    List<Double> horariosNeuro = new ArrayList<>();
    List<Double> horariosOrtopedista = new ArrayList<>();
    List<Double> horariosGastro = new ArrayList<>();
    List<Double> horariosOtorrino = new ArrayList<>();
    private Double horarioDesejado;
    Agendamento agendamento = new Agendamento();

    public void adicionaEspecialidades(){
        especialidades.add("Clínico geral");
        especialidades.add("Cardiologista");
        especialidades.add("Dermatologista");
        especialidades.add("Oftalmologista");
        especialidades.add("Neurologista");
        especialidades.add("Ortopedista");
        especialidades.add("Gastroenterologista");
        especialidades.add("Otorrinolaringologista");

        for (String especialidade : especialidades){
            System.out.println("Especialidade: " + especialidade);
        }
    }

    public void disponibilidadeEspecialista(String esp, Scanner sc){
        switch (esp){
            case "Clinico geral":
                horariosClinico.add(8.15);
                horariosClinico.add(8.45);
                horariosClinico.add(9.10);
                horariosClinico.add(9.40);
                horariosClinico.add(10.20);
                System.out.println("Atende de Seg e Quarta, horários:");

                for (Double clinico : horariosClinico){
                    System.out.printf("%.2f \n",clinico);
                }
                System.out.println("Qual deseja agendar?");


                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc, horariosClinico,esp,horarioDesejado);
                break;

            case "Cardiologista":
                horariosCardiologista.add(7.00);
                horariosCardiologista.add(8.00);
                horariosCardiologista.add(9.00);
                horariosCardiologista.add(10.00);
                horariosCardiologista.add(11.00);
                System.out.println("Atende de Ter e Quarta, horários:");

                for (Double cardio : horariosCardiologista){
                    System.out.printf("%.2f \n",cardio);
                }
                System.out.println("Qual deseja agendar?");

                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc, horariosCardiologista,esp,horarioDesejado);
                break;

            case "Dermatologista":
                horariosDermato.add(7.40);
                horariosDermato.add(8.40);
                horariosDermato.add(9.40);
                horariosDermato.add(10.40);
                horariosDermato.add(11.40);
                horariosDermato.add(13.40);
                horariosDermato.add(14.40);
                horariosDermato.add(15.40);
                System.out.println("Atende de Ter, Quarta e Quinta, horários:");

                for (Double dermato : horariosDermato){
                    System.out.printf("%.2f \n",dermato);
                }
                System.out.println("Qual deseja agendar?");
                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc,horariosDermato, esp,horarioDesejado);
                break;

            case "Oftalmologista":
                horariosOftalmo.add(9.00);
                horariosOftalmo.add(10.00);
                horariosOftalmo.add(11.00);
                horariosOftalmo.add(13.00);
                horariosOftalmo.add(14.00);
                horariosOftalmo.add(15.00);
                horariosOftalmo.add(16.00);
                horariosOftalmo.add(17.00);
                horariosOftalmo.add(18.00);
                System.out.println("Atende de Sex e Sáb, horários:");

                for (Double oftalmo : horariosOftalmo){
                    System.out.printf("%.2f \n",oftalmo);
                }
                System.out.println("Qual deseja agendar?");
                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc,horariosOftalmo, esp,horarioDesejado);
                break;

            case "Neurologista":
                horariosNeuro.add(13.00);
                horariosNeuro.add(13.30);
                horariosNeuro.add(14.00);
                horariosNeuro.add(14.30);
                horariosNeuro.add(15.00);
                horariosNeuro.add(15.30);
                System.out.println("Atende de Sexta e Sáb, nos seguintes horários:");

                for (Double neuro : horariosNeuro){
                    System.out.printf("%.2f \n",neuro);
                }
                System.out.println("Qual deseja agendar?");

                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc,horariosNeuro,esp,horarioDesejado);
                break;

            case "Ortopedista":
                horariosOrtopedista.add(13.00);
                horariosOrtopedista.add(13.40);
                horariosOrtopedista.add(14.00);
                horariosOrtopedista.add(14.40);
                horariosOrtopedista.add(15.00);
                horariosOrtopedista.add(15.40);
                horariosOrtopedista.add(16.00);
                horariosOrtopedista.add(16.40);
                horariosOrtopedista.add(17.00);
                horariosOrtopedista.add(17.40);
                horariosOrtopedista.add(18.00);
                System.out.println("Atende de Ter, horários:");

                for (Double ortopedista : horariosOrtopedista){
                    System.out.printf("%.2f \n",ortopedista);
                }
                System.out.println("Qual deseja agendar?");

                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc,horariosOrtopedista,esp,horarioDesejado);
                break;

            case "Gastroenterologista":
                horariosGastro.add(15.00);
                horariosGastro.add(15.40);
                horariosGastro.add(16.00);
                horariosGastro.add(16.40);
                horariosGastro.add(17.00);
                horariosGastro.add(17.40);
                horariosGastro.add(18.00);
                System.out.println("Atende de Quin, horários:");


                for (Double gastro : horariosGastro){
                    System.out.printf("%.2f \n",gastro);
                }
                System.out.println("Qual deseja agendar?");

                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc,horariosGastro,esp,horarioDesejado);
                break;

            case "Otorrinolaringologista":
                horariosOtorrino.add(10.00);
                horariosOtorrino.add(12.00);
                horariosOtorrino.add(14.00);
                horariosOtorrino.add(16.00);
                horariosOtorrino.add(18.00);
                horariosOtorrino.add(20.00);
                System.out.println("Atende de Quin, horários:");


                for (Double otorr : horariosOtorrino){
                    System.out.printf("%.2f \n",otorr);
                }
                System.out.println("Qual deseja agendar?");

                horarioDesejado = sc.nextDouble();
                agendamento.agendamentoCliente(sc,horariosOtorrino,esp,horarioDesejado);
                break;
        }
    }

}
