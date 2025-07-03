import Java.ProgramacaoOO.Aula.Exercicio02.model.Aluno.Aluno;

class Main{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "Matemática", 8.5);

        System.out.println(aluno.mostrarAluno());
        System.out.println("\nSituação: " + aluno.mostrarSituacao());
        aluno.setNotaFinal(6.0);
        System.out.println("\nApós atualização da nota:");
        System.out.println(aluno.mostrarAluno());
        System.out.println("\nSituação: " + aluno.mostrarSituacao());
    }
}