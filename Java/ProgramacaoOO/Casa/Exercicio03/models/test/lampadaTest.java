package Java.ProgramacaoOO.Casa.Exercicio03.models.test;

import Java.ProgramacaoOO.Casa.Exercicio03.models.Lampada.Lampada;

public class lampadaTest {
    public static void main(String[] args) {
        Lampada lampadaLab1 = new Lampada(true);
        Lampada lampadaLab2 = new Lampada(false, 20);

        lampadaLab1.informarSituacao();
        lampadaLab1.informarPotencia();
        lampadaLab2.informarSituacao();
        lampadaLab2.informarPotencia();
    }
}
