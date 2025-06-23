package Java.ProgramacaoOO.Aula.Exercicio01.Model.Automovel;

public class Automovel{
    public String proprietario;
    public String marca;
    public String placa;
    public int ano;

    public void Registrar(String proprietario, String marca, String placa, int ano){
        this.proprietario = proprietario;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
    }

    public String transferirProprietario(String novoProprietario){
        this.proprietario = novoProprietario;
        return this.proprietario;
    }

    public void mudarPlaca(String novaPlaca){
        this.placa = novaPlaca;
    }

    public String apresentar(){
        return "Proprietário: " + proprietario + 
            "\nMarca: " + marca + 
            "\nPlaca: " + placa + 
            "\nAno: " + ano
        ;
    }
}