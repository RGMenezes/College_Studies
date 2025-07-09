package Java.ProgramacaoOO.Aula.Exercicio05.model;

public class Veiculo {
    private String _marca;
    private String _modelo;
    private int _ano;
    private double _velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano) {
        this._marca = marca;
        this._modelo = modelo;
        this._ano = ano;
        this._velocidadeAtual = 0.0;
    }

    public double getVelocidadeAtual() {
        return this._velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual < 0) throw new IllegalArgumentException("A velocidade não pode ser negativa.");
        this._velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(double kmh) {
        if (kmh < 0) throw new IllegalArgumentException("O kmh não pode ser negativo.");
        this._velocidadeAtual += kmh;
    }

    public void frear(double kmh) {
        if (kmh < 0) throw new IllegalArgumentException("O kmh não pode ser negativo.");
        if(this._velocidadeAtual - kmh < 0)
            this._velocidadeAtual = 0;
        else
            this._velocidadeAtual -= kmh;
    }

    public String exibirDados() {
        return "Marca: " + _marca + "\nModelo: " + _modelo + "\nAno: " + _ano + "\nVelocidade Atual: " + _velocidadeAtual + " km/h";
    }

    public boolean parado(){
        return this._velocidadeAtual == 0;
    }
}
