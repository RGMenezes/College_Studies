package Java.ProgramacaoOO.Casa.Exercicio02.view;

import Java.ProgramacaoOO.Casa.Exercicio02.model.Conta;
import Java.ProgramacaoOO.Casa.Exercicio02.model.Contador;
import Java.ProgramacaoOO.Casa.Exercicio02.model.Mes;
import Java.ProgramacaoOO.Casa.Exercicio02.model.Numero;

public class Main {
    public static void main(String[] args) {
        // Teste da classe Numero
        Numero numero = new Numero();
        System.out.println("O valor de n1 é: " + numero.getN1());
        numero.setN1(10);
        System.out.println("O valor de n1 agora é: " + numero.getN1());
        System.out.println("O valor de n2 é: " + numero.getN2());
        numero.setN2(20);
        System.out.println("O valor de n2 agora é: " + numero.getN2());
        numero.trocar();
        System.out.println("Após a troca, o valor de n1 é: " + numero.getN1());
        System.out.println("Após a troca, o valor de n2 é: " + numero.getN2());

        // Teste da classe Mes
        Mes mes = new Mes();
        mes.setMes1(1000.50);
        mes.setMes2(1500.75);
        mes.setMes3(2000.25);
        System.out.println("\n\nO valor do primeiro mês é: " + mes.getMes1());
        System.out.println("O valor do segundo mês é: " + mes.getMes2());
        System.out.println("O valor do terceiro mês é: " + mes.getMes3());
        double totalTrimestre = mes.calcularTrimestre();
        System.out.println("O total do trimestre é: " + totalTrimestre);

        // Teste da classe Conta
        Conta conta = new Conta();
        System.out.println("\n\nO saldo inicial da conta é: " + conta.getSaldo());
        conta.depositar(500.00);
        System.out.println("Após o depósito, o saldo é: " + conta.getSaldo());
        boolean saqueRealizado = conta.sacar(100.00);
        if (saqueRealizado) {
            System.out.println("Saque realizado com sucesso! O saldo atual é: " + conta.getSaldo());
        } else {
            System.out.println("Saque não realizado. Verifique o valor ou o saldo.");
        }
        System.out.println("Extrato da conta: " + conta.exibirExtrato());

        // Teste da classe Contador
        Contador contador = new Contador();
        contador.setNumero(129);
        System.out.println("\n\nNúmero inicial: " + contador.getNumero());
        contador.incrementar();
        System.out.println("Número após incremento: " + contador.getNumero());
        contador.desfazerIncremento();
        System.out.println("Número após desfazer incremento: " + contador.getNumero());
        contador.main(); // Chamada do método main da classe Contador
    }   
}
