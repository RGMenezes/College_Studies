package Java.ProgramacaoOO.Aula.Exercicio08.model;

public class Medico {
    private String nome;
    private String crm;
    private Especialidade especialidade;

    public Medico(String nome, String crm, Especialidade especialidade){
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public Especialidade getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
}
