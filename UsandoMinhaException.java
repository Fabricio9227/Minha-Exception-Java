package minhaException;

public class UsandoMinhaException {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denom = {2, 0, 1, 8, 0, 2, 4};

        for(int i=0;i < numeros.length;i++) {
            try {
                if(numeros[i] % 2 != 0) { // Se a divisão de um elemento do array de "números" dividido por 2 for diferente de 0
                    //Lanço minha excepetion aqui
                    throw new DivisaoNaoExata(numeros[i], denom[i]); //Lançamos a exceção e criamos o objeto dela com os parâmetros solicitados pelo construtor
                }
                System.out.println(numeros[1] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
            } 
             catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata erro) { //Aqui temos um catch que trata 3 tipos de Exception, uma aritmética, uma de arrays e a nossa Exception personalizada!
                System.out.println("Aconteceu um erro: " + erro.getMessage());
                erro.printStackTrace();
            }
        }
    }
}
