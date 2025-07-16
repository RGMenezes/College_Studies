package Java.ProgramacaoOO.Aula.Exercicio06.view;

import Java.ProgramacaoOO.Aula.Exercicio06.model.Aluno;

public class Main {
    public static void main(String[] args) {
        System.out.println(Aluno.getTotalAlunos());

        Aluno al1 = new Aluno("Asafe Cabelão", "12396213");
        System.out.println(Aluno.getTotalAlunos());

        Aluno al2 = new Aluno("Gabis Log e", "12362139");
        System.out.println(Aluno.getTotalAlunos());
        
        System.out.println(al1.getMatricula() + " <-- | --> " + al2.getMatricula());
    }
}
