package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio01;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        PreencherVetor(vetor, -10, 10);

        System.out.println(MostrarlVetor(vetor));
        System.out.println(VerificarNumerosNegativos(vetor));
    }

    static void PreencherVetor(int vetor[], int min, int max){
        Random entradaAleatoria = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = entradaAleatoria.nextInt(max + (-1 * min)) + min;
        }
    }
    
    static String MostrarlVetor(int vetor[]){
        String retorno = "";
        for (int i = 0; i < vetor.length; i++) {
            retorno += vetor[i] + " ";
        }
        return retorno;
    }

    static int VerificarNumerosNegativos(int vetor[]){
        int contadorNumeroNegativo = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0){
                contadorNumeroNegativo++;
            }
        }
        return contadorNumeroNegativo;
    }
}

// 1. Implemente uma fun¸c˜ao que receba como parˆametro um vetor de n´umeros reais e retorne quantos n´umeros
// negativos est˜ao armazenados nesse vetor.