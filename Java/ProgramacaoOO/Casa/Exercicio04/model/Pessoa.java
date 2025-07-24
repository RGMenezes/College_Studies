package Java.ProgramacaoOO.Casa.Exercicio04.model;

public class Pessoa {
    private String nome;
    private int idade;
    private int diaDN;
    private int mesDN;
    private int anoDN;
    private Universidade universidade;
    private Departamento departamento;

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.diaDN = dia;
        this.mesDN = mes;
        this.anoDN = ano;
    }

    public Universidade getUniversidade() {
        return universidade;
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
        this.departamento = universidade.getDepartamento();
    }

    public void calcularIdade(int dia, int mes, int ano){
        int idade = ano - this.anoDN;
        if(mes < this.mesDN || (mes == this.mesDN && dia < this.diaDN)) idade--;
        this.idade = idade;
    }

    public int informaIdade(){
        return this.idade;
    }

    public String informaNome(){
        return this.nome;
    }

    public Departamento informarDepartamento(){
        return this.departamento;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano){
        this.diaDN = dia;
        this.mesDN = mes;
        this.anoDN = ano;
    }

    public String apresentacao(){
        return "Me chamo " + this.nome + " e trabalho na universidade " + this.universidade.informarNome() + ".";
    }
}
