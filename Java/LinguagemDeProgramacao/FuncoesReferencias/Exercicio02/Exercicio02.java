package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio02;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        PreencherVetor(vetor, -10, 10);


    }

    static int[] InverterVetor(int vetor[]){
        final int tamanho
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
}

// 2. Implemente uma fun¸c˜ao que receba como parˆametro um vetor de n´umeros inteiros e inverta a ordem dos elementos
// armazenados nesse vetor.