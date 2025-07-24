package Java.ProgramacaoOO.Casa.Exercicio04.view;

import Java.ProgramacaoOO.Casa.Exercicio04.model.Departamento;
import Java.ProgramacaoOO.Casa.Exercicio04.model.Pessoa;
import Java.ProgramacaoOO.Casa.Exercicio04.model.Universidade;

public class Main {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");
        princeton.setDepartamento(new Departamento("Departamento de Matemática"));
        cambridge.setDepartamento(new Departamento("Departamento de Física"));
        
        einstein.setUniversidade(princeton);
        newton.setUniversidade(cambridge);

        // Teste de apresentação
        System.out.println("\n" + einstein.apresentacao());
        System.out.println(newton.apresentacao());

        // Teste de idade
        einstein.calcularIdade(24, 7, 2025);
        newton.calcularIdade(24, 7, 2025);
        System.out.println("\nIdade de " + einstein.informaNome() + ": " + einstein.informaIdade());
        System.out.println("Idade de " + newton.informaNome() + ": " + newton.informaIdade());

        // Teste de ajuste de data de nascimento
        einstein.ajustaDataDeNascimento(15, 3, 1880);
        einstein.calcularIdade(24, 7, 2025);
        System.out.println("\nNova idade de " + einstein.informaNome() + ": " + einstein.informaIdade());

        // Teste de departamento
        System.out.println("\nDepartamento via getUniversidade: " + einstein.getUniversidade().getDepartamento().getNome());
        System.out.println("Departamento via informarDepartamento: " + einstein.informarDepartamento().getNome());

        System.out.println("\nDepartamento via getUniversidade: " + newton.getUniversidade().getDepartamento().getNome());
        System.out.println("Departamento via informarDepartamento: " + newton.informarDepartamento().getNome());

        // Reescrita de departamento
        newton.getUniversidade().getDepartamento().setNome("Departamento de Artes");
        System.out.println("\nDepartamento via getUniversidade: " + newton.getUniversidade().getDepartamento().getNome());
        System.out.println("Departamento via informarDepartamento: " + newton.informarDepartamento().getNome());

        newton.informarDepartamento().setNome("Departamento de Arquitetura");
        System.out.println("\nDepartamento via getUniversidade: " + newton.getUniversidade().getDepartamento().getNome());
        System.out.println("Departamento via informarDepartamento: " + newton.informarDepartamento().getNome());
    }
}
