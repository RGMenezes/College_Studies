package Java.ProgramacaoOO.Aula.Exercicio03.Test;

import Java.ProgramacaoOO.Aula.Exercicio03.model.fatura.Fatura;

public class faturaTest {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        
        fatura.setNumero("12345");
        fatura.setDescricao("Compra de materiais de escritório");
        fatura.setQuantidadeComprada(10);
        fatura.setPreco(15.50);
        
        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade de Itens: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por Item: R$ " + fatura.getPreco());
        System.out.println("Total da Fatura: R$ " + fatura.getTotalFatura());
    }
}
