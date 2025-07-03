package Java.ProgramacaoOO.Aula.Exercicio03.Test;

import Java.ProgramacaoOO.Aula.Exercicio03.model.data.Data;

public class dataTest {
    public static void main(String[] args) {
        Data data1 = new Data(15, 8, 2023);

        System.out.println("Data 1: " + data1.displayData());
        data1.setDia(16);
        data1.setMes(9);
        data1.setAno(2024);
        System.out.println("Data 1 atualizada: " + data1.displayData());
    }
}
