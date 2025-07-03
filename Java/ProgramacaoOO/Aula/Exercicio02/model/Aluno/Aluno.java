package Java.ProgramacaoOO.Aula.Exercicio02.model.Aluno;

public class Aluno {
    private String nome;
    private String disciplina;
    private double notaFinal;

    public Aluno(String nome, String disciplina, double notaFinal) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String mostrarAluno() {
        return "Nome: " + nome + "\nDisciplina: " + disciplina + "\nNota Final: " + notaFinal;
    }

    public String mostrarSituacao() {
        if (notaFinal >= 7) {
            return "Aprovado";
        } else if (notaFinal >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
