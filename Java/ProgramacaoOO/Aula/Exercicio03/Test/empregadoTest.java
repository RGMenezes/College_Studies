package Java.ProgramacaoOO.Aula.Exercicio03.Test;

import Java.ProgramacaoOO.Aula.Exercicio03.model.empregado.Empregado;

public class empregadoTest {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 3000.00);
        testarEmpregado(empregado1);

        Empregado empregado2 = new Empregado("Maria", "Oliveira", 4500.00);
        testarEmpregado(empregado2);
    }

    private static void testarEmpregado(Empregado empregado) {
        System.out.println("\n");
        System.out.println(empregado.mostrarEmpregado());
        System.out.println("Salário Anual: R$ " + empregado.calcularSalarioAnual());
        
        empregado.aumentarSalario(10);
        System.out.println("Após aumento de 10%:");
        System.out.println(empregado.mostrarEmpregado());
    }
}
