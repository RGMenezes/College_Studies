package Java.ProgramacaoOO.Aula.Exercicio06.model;

public class Aluno {

    private String nome, curso;
    private int periodo = 0;
    private String matricula;
    static private int totalAlunos = 0;


    public Aluno(String nome, String mat){
        this.nome = nome;
        this.matricula = mat;
        Aluno.totalAlunos++;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public static int getTotalAlunos() {
        return totalAlunos;
    }
    public static void setTotalAlunos(int totalAlunos) {
        Aluno.totalAlunos = totalAlunos;
    }
}