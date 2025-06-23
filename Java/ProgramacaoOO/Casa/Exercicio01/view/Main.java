package Java.ProgramacaoOO.Casa.Exercicio01.view;

import Java.ProgramacaoOO.Casa.Exercicio01.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.registrar("Jhon", "TI", 1000.0, "01/01/2020", "1234567", true);

        System.out.println("Dados iniciais:");
        f1.mostrar();

        f1.bonifica(500.0);
        System.out.println("\nApós bonificação:");
        f1.mostrar();

        f1.demite();
        System.out.println("\nApós demissão:");
        f1.mostrar();

        Funcionario f2 = new Funcionario();
        f2.registrar("Anna", "RH", 2000.0, "15/03/2021", "7654321", true);
        System.out.println("\nNovo funcionário:");
        f2.mostrar();

        f2.bonifica(300.0);
        f2.demite();
        System.out.println("\nApós bonificação e demissão de Anna:");
        f2.mostrar();
    }
}