package Java.ProgramacaoOO.Casa.Exercicio04.model;

public class Universidade {
    private String nome;
    private Departamento departamento;

    public Universidade(String nome){
        this.nome = nome;
    }

    public String informarNome(){
        return this.nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
