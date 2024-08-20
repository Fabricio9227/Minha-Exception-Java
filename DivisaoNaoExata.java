package minhaException;

public class DivisaoNaoExata extends Exception {
    private int num;
    private int dem;

    public DivisaoNaoExata(int num, int denom) {
        super(); //Faz referência à superclasse/mãe, possui basicamento o mesmo uso do "this.", só que, ao invés de acessar a prórpia classe, o "super()" acessa a classe mãe/superclasse
        this.num = num;
        this.dem = denom;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + "/" + dem + " não é um número inteiro!";
    }
}
