package Java.ProgramacaoOO.Aula.Exercicio01.view;
import Java.ProgramacaoOO.Aula.Exercicio01.Model.Automovel.Automovel;
import Java.ProgramacaoOO.Aula.Exercicio01.Model.Automovel.AutomovelSemiNovo;

class Main{
    public static void main(String[] args) {
        Automovel corola = new Automovel();
        corola.Registrar("Asafe Cabelão", "Toyota", "ABC-1234", 2020);
        
        AutomovelSemiNovo civic = new AutomovelSemiNovo();
        civic.Registrar("Maria", "Hon987da", "XYZ-5678", 2019, 0);

        System.out.println("\n" + corola.apresentar());
        System.out.println("\n" + civic.apresentar() + "\n");
    }
}