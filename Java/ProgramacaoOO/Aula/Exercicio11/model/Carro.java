package Java.ProgramacaoOO.Aula.Exercicio11.model;

public class Carro {
    private String placa;
    private String modelo;
    private Vaga vagaOcupada;

    public Carro(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.vagaOcupada = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vaga getVagaOcupada() {
        return vagaOcupada;
    }

    public void setVagaOcupada(Vaga vagaOcupada) {
        this.vagaOcupada = vagaOcupada;
    }

    @Override
    public String toString() {
        return "Placa: " + this.placa + "\nModelo: " + this.modelo;
    }
}


// Classe Carro:
// • Atributos:
// • placa (String): Placa do carro (ex: "ABC-1234")
// • modelo (String): Modelo do carro (ex: "Fiat Uno")
// • vagaOcupada (Vaga): Referência à vaga que o carro está ocupando
// • Métodos:
// • Construtor que recebe placa e modelo
// • Getters e Setters
// • Método toString() para exibir dados do carro