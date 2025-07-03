package Java.ProgramacaoOO.Casa.Exercicio03.models.test;

import Java.ProgramacaoOO.Casa.Exercicio03.models.Data.Data;

public class dataTest {
    public static void main(String[] args) {
        Data hoje = new Data(03, 7, 2025);
        hoje.escreverAData();

        Data natal = new Data(25, 12, 2025);
        natal.escreverAData();
    }
}
