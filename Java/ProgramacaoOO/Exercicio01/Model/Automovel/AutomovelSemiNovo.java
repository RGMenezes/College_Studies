package Model.Automovel;

public class AutomovelSemiNovo extends Automovel {
    int kmRodados;

    public void Registrar(String proprietario, String marca, String placa, int ano, int kmRodados) {
        if(kmRodados < 1) {
            throw new IllegalArgumentException("KM Rodados em um veiculo seminovo não pode ser negativo ou 0.");
        }
        super.Registrar(proprietario, marca, placa, ano);
        this.kmRodados = kmRodados;
    }

    public String apresentar(){
        return super.apresentar() + "\nKM Rodados: " + kmRodados;
    }
}
