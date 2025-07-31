package Java.ProgramacaoOO.Aula.Exercicio11.model;

import java.util.*;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Animal> animais;
    private static int quantidadeClientes = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.animais = new ArrayList<>();
        quantidadeClientes++;
    }

    public void adicionarAnimal(Animal a) {
        animais.add(a);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal.toString());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static int getQuantidadeClientes() {
        return quantidadeClientes;
    }
}

// Classe Cliente:
// • Atributos:
// • nome (String): Nome do cliente
// • cpf (String): CPF do cliente
// • animais (List): Lista de animais do cliente
// • quantidadeClientes (static int): Contador total de clientes criados
// • Métodos:
// • Construtor que recebe nome e CPF, incrementa quantidadeClientes
// • adicionarAnimal(Animal a)
// • listarAnimais(): imprime todos os animais do cliente
// • Getters e Setters
