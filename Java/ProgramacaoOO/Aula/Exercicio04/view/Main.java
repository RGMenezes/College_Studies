package Java.ProgramacaoOO.Aula.Exercicio04.view;

import java.util.ArrayList;
import java.util.List;

import Java.ProgramacaoOO.Aula.Exercicio04.model.Animal;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        
        animais.add(new Animal("Rex", "Cachorro", 3, 20.5));
        animais.add(new Animal("Miau", "Gato", 2, 5.0));
        animais.add(new Animal("Tweety", "Pássaro", 1, 0.5));
        animais.add(new Animal("Bobby", "Cachorro", 4, 25));

        for (Animal animal : animais) {
            System.out.println("\n" + animal.exibirDados());
            System.out.println("É adulto? " + (animal.ehAdulto() ? "Sim" : "Não"));
            animal.enelhecer();
            System.out.println("Após envelhecer:\n" + animal.exibirDados());
            animal.engordar(2.0);
            System.out.println("Após engordar:\n" + animal.exibirDados());
            animal.emagrecer(1.0);
            System.out.println("Após emagrecer:\n" + animal.exibirDados());
        }
    }
}
