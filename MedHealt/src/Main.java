import menuInicial.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pode digitar seu nome, por favor?");
        String nome = sc.nextLine();
        Menu menuIncial = new Menu(nome);
        menuIncial.opcoesMenu();
    }
}