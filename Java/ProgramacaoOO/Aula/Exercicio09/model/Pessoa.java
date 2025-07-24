package Java.ProgramacaoOO.Aula.Exercicio09.model;

public class Pessoa {
    private String nome;
    private int idade;
    private int diaDN;
    private int mesDN;
    private int anoDN;

    public int getDiaDN() {
        return diaDN;
    }
    public void setDiaDN(int diaDN) {
        this.diaDN = diaDN;
    }
    public int getMesDN() {
        return mesDN;
    }
    public void setMesDN(int mesDN) {
        this.mesDN = mesDN;
    }
    public int getAnoDN() {
        return anoDN;
    }
    public void setAnoDN(int anoDN) {
        this.anoDN = anoDN;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void calcularIdade(int dia, int mes, int ano){

    }
}
