package Java.ProgramacaoOO.Aula.Exercicio05.view;

import java.util.ArrayList;
import java.util.List;

import Java.ProgramacaoOO.Aula.Exercicio05.model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        List<ContaBancaria> banco = new ArrayList<>();

        banco.add(new ContaBancaria("João Silva", "12345-6"));
        banco.add(new ContaBancaria("Maria Oliveira", "98765-4"));

        banco.get(0).depositar(1000.00);
        banco.get(1).depositar(500.00);

        try {
            String resultado = pix(banco.get(0), banco.get(1), 200.00);
            System.out.println(resultado);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao realizar PIX: " + e.getMessage());
        }
        
        try {
            String resultado = pix(banco.get(1), banco.get(0), 600.00);
            System.out.println(resultado);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao realizar PIX: " + e.getMessage());
        }
    }

    private static String pix(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        if (contaOrigem.getSaldo() < valor)
            throw new IllegalArgumentException("Saldo insuficiente para realizar o PIX.");

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
        
        return String.format("PIX realizado com sucesso!\n%s\n%s\nValor: %.2f", 
            contaOrigem.exibirInfo(), 
            contaDestino.exibirInfo(), 
            valor
        );
    }
}
