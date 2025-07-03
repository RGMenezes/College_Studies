package Java.ProgramacaoOO.Casa.Exercicio03.views;

// import Java.ProgramacaoOO.Casa.Exercicio03.models.Data.Data;
import Java.ProgramacaoOO.Casa.Exercicio03.models.Lampada.Lampada;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(false, 12);
        lampada.acender();
        lampada.informarSituacao();
        lampada.apagar();
        lampada.informarSituacao();
        lampada.informarPotencia();

        System.out.println("\n");

        // Data data = new Data();
        // data.dia = 15;
        // data.mes = 7;
        // data.ano = 2024;
        // data.escreverAData();
        // data.escreverOMes();
        // data.verificarAnoBissexto();

        // data.ano = 2025;
        // data.verificarAnoBissexto();
        // data.quantoFaltaFimDoAno();

        // data.ano = 2030;
        // data.quantoFaltaFimDoAno();
    }
}
