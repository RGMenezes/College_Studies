package Java.ProgramacaoOO.Aula.Exercicio11.model;

public class Animal {
    private String nome;   
    private String tipo;
    private Cliente cliente;

    public Animal(String nome, String tipo, Cliente cliente) {
        this.nome = nome;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTipo: " + tipo + "\nDono: " + (cliente != null ? cliente.getNome() : "Desconhecido");
    }
}


// Classe Animal:
// • Atributos:
// • nome (String): Nome do animal
// • tipo (String): Tipo de animal (ex: “Cachorro”, “Gato”, “Pássaro”)
// • cliente (Cliente): Dono do animal
// • Métodos:
// • Construtor para inicializar nome, tipo e cliente
// • Getters e Setters
// • Método toString() para exibir dados do animal