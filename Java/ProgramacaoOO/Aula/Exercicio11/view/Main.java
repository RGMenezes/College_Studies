package Java.ProgramacaoOO.Aula.Exercicio11.view;

import Java.ProgramacaoOO.Aula.Exercicio11.model.Animal;
import Java.ProgramacaoOO.Aula.Exercicio11.model.Cliente;
import Java.ProgramacaoOO.Aula.Exercicio11.model.Carro;
import Java.ProgramacaoOO.Aula.Exercicio11.model.Vaga;

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("ABC-1234", "Fiat Uno");
        Carro carro2 = new Carro("XYZ-5678", "Volkswagen Gol");
        Vaga vaga1 = new Vaga(1);
        Vaga vaga2 = new Vaga(2);

        vaga1.ocupar(carro1);
        vaga2.ocupar(carro2);
        System.out.println("\nVaga 1 ocupada por: " + vaga1.getCarroAtual());
        System.out.println("\nVaga 2 ocupada por: " + vaga2.getCarroAtual());
        System.out.println("\nTotal de vagas criadas: " + Vaga.getTotalVagasCriadas());
        vaga1.liberar();
        System.out.println("\nVaga 1 após liberação: " + vaga1.toString());
        vaga2.liberar();
        System.out.println("\nVaga 2 após liberação: " + vaga2.toString());
        System.out.println("\nTotal de vagas criadas: " + Vaga.getTotalVagasCriadas());

        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");
        Animal animal1 = new Animal("Rex", "Cachorro", cliente1);
        Animal animal2 = new Animal("Miau", "Gato", cliente2);

        cliente1.adicionarAnimal(animal1);
        cliente2.adicionarAnimal(animal2);
        System.out.println("\nAnimais do cliente " + cliente1.getNome() + ":");
        cliente1.listarAnimais();
        System.out.println("\nAnimais do cliente " + cliente2.getNome() + ":");
        cliente2.listarAnimais();
        System.out.println("\nQuantidade total de clientes: " + Cliente.getQuantidadeClientes());
    }   
}