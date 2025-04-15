package Java.LinguagemDeProgramacao.FuncoesReferencias.Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entradaTeclado = new Scanner(System.in);
        String palavra = entradaTeclado.next();
        char listaLetras[] = separarLetras(palavra);
    }

    static char[] embaralhar(char[] listaLetras){
        char novaLista[] = new String
    }

    static String juntarLetras(char[] listaLetras){
        String palavras = "";
        for (int i = 0; i < listaLetras.length; i++) {
            palavras += listaLetras[i];
        }
        return palavras;
    }

    static char[] separarLetras(String palavras){
        char listaLetras[] = new char[palavras.length()];
        for (int i = 0; i < palavras.length(); i++) {
            listaLetras[i] = palavras.charAt(i);
        }
        return listaLetras;
    }
}

// 7. Embaralha palavra. Construa uma função que receba uma string como parâmetro e devolva outra string com
// os carateres embaralhados. Por exemplo: se função receber a palavra python, pode retornar npthyo, ophtyn ou
// qualquer outra combinação possı́vel, de forma aleatória. Padronize em sua função que todos os caracteres serão
// devolvidos em caixa alta ou caixa baixa, independentemente de como foram digitados.
// Obs: Copie a string para um vetor de char para poder realizar a manipulação dos caracteres. Utilize as funções
// anteriormente criadas para isso.