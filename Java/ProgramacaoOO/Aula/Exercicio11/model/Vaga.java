package Java.ProgramacaoOO.Aula.Exercicio11.model;

public class Vaga {
    private int numero;
    private boolean ocupada;
    private Carro carroAtual;
    private static int totalVagasCriadas = 0;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.carroAtual = null;
        totalVagasCriadas++;
    }

    public int getNumero() {
        return numero;
    }
    public boolean isOcupada() {
        return ocupada;
    }
    public Carro getCarroAtual() {
        return carroAtual;
    }
    public static int getTotalVagasCriadas() {
        return totalVagasCriadas;
    }
    public void ocupar(Carro carro) {
        if (!this.ocupada) {
            this.carroAtual = carro;
            this.ocupada = true;
            carro.setVagaOcupada(this);
        } else {
            System.out.println("A vaga já está ocupada.");
        }
    }
    public void liberar() {
        if (this.ocupada) {
            this.carroAtual.setVagaOcupada(null);
            this.carroAtual = null;
            this.ocupada = false;
        } else {
            System.out.println("A vaga já está livre.");
        }
    }

    @Override
    public String toString() {
        return "\nNumero: " + this.numero + "\nOcupada: " + this.ocupada + "\ncarroAtual: " + (this.carroAtual != null ? this.carroAtual.toString() : "Nenhum");
    }
}


// Classe Vaga:
// • Atributos:
// • numero (int): Número da vaga
// • ocupada (boolean): Indica se a vaga está ocupada
// • carroAtual (Carro): Carro atualmente na vaga
// • totalVagasCriadas (static int): Contador de vagas criadas
// • Métodos:
// • Construtor que recebe o número da vaga e incrementa totalVagasCriadas
// • ocupar(Carro carro): associa o carro à vaga e define como ocupada
// • liberar(): libera a vaga e remove a associação com o carro
// • toString(): exibe o status da vaga