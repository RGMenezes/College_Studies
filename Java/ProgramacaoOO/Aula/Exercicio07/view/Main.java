package Java.ProgramacaoOO.Aula.Exercicio07.view;

import Java.ProgramacaoOO.Aula.Exercicio07.model.Cliente;
import Java.ProgramacaoOO.Aula.Exercicio07.model.Endereco;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Gabis Log de e", "123123123-12", 1500);
        cli1.setEndereco(new Endereco("RJ", "0", "Do lado da casa de Asafe Cabelão", "Botafogo"));

        System.out.println(cli1.mostrarDados());
        System.out.println("\n" + cli1.getEndereco().consultarEndereco());
        System.out.println("\n" + cli1.avaliarCliente());
    }
}
