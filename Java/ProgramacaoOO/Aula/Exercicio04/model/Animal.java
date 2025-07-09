package Java.ProgramacaoOO.Aula.Exercicio04.model;

public class Animal {
    private String _nome;
    private String _especie;
    private int _idade;
    private double _peso;

    public Animal(String nome, String especie, int idade, double peso) {
        this._nome = nome;
        this._especie = especie;
        this._idade = idade;
        this._peso = peso;
    }

    public int getIdade() {
        return _idade;
    }
    public void setIdade(int idade) {
        if(idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this._idade = idade;
    }
    public double getPeso() {
        return _peso;
    }
    public void setPeso(double peso) {
        if(peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser positivo.");  
        }
    }

    public String exibirDados() {
        return "Nome: " + _nome + ", Espécie: " + _especie + ", Idade: " + _idade + ", Peso: " + _peso;
    }

    public void enelhecer(){
        this._idade++;
    }

    public void engordar(double kg) {
        if(kg <= 0) {
            throw new IllegalArgumentException("Peso ganho deve ser positivo.");
        }
        this._peso += kg;
    }

    public void emagrecer(double kg) {
        if(kg <= 0) {
            throw new IllegalArgumentException("Peso perdido deve ser positivo.");
        }
        if(this._peso - kg < 0) {
            throw new IllegalArgumentException("Peso final não pode ser negativo.");
        }
        this._peso -= kg;
    }

    public boolean ehAdulto(){
        return this._idade >= 2;
    }
}