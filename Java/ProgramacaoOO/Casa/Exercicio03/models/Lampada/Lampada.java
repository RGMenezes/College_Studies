package Java.ProgramacaoOO.Casa.Exercicio03.models.Lampada;

public class Lampada {
    public boolean acesa;
    public int potencia;

    public Lampada(boolean acesa){
        this.acesa = acesa;
    }

    public Lampada(boolean acesa, int potencia){
        this.acesa = acesa;
        this.potencia = potencia;
    }

    public void acender(){
        if(!acesa) acesa = true;
    }

    public void apagar(){
        if(acesa) acesa = false;
    }

    public void informarSituacao(){
        if(acesa) {
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }

    public void informarPotencia(){
        System.out.println("A potência da lâmpada é: " + potencia + " watts.");
    }
}
