package Java.ProgramacaoOO.Casa.Exercicio02.model;

public class Numero {
    int n1;
    int n2;

    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN1() {
        return n1;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN2() {
        return n2;
    }

    public void trocar() {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
}
