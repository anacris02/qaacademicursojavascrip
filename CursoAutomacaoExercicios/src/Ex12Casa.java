public class Ex12Casa {
    public static int[] trocarValores(int valor1, int valor2){
    int aux = valor1;
    valor1 = valor2;
    valor2 = aux;

    int[] valores = new int [2];
    valores[0] = valor1;
    valores[1] = valor2;

    return valores;
    }
    public static void main(String[] args){
        int  primeiroValor = 10;
        int segundoValor = 30;

        System.out.println("o primeiro valor é: "+trocarValores(primeiroValor, segundoValor)[0]
        +" \n o segundo valor é: "+trocarValores(primeiroValor, segundoValor)[1]);
        
    }
    
}
