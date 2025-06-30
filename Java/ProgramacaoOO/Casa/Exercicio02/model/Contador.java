package Java.ProgramacaoOO.Casa.Exercicio02.model;

public class Contador {
    int numero;
    int incremento;

    public int getNumero() {
        return numero;
    }   
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void incrementar() {
        this.numero += 1;
        this.incremento += 1;
    }
    public void desfazerIncremento() {
        this.numero -= this.incremento;
        this.incremento = 0;
    }

    public void main(){
        this.numero = 10;
        this.incrementar();
        System.out.println("Número após incremento: " + this.numero);
        this.desfazerIncremento();
        System.out.println("Número após desfazer incremento: " + this.numero);
    }
}
