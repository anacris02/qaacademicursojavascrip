public class ExParametro {
    public static void somaParametros(int numero2, int numero3, int numero4){
System.out.println(numero2+numero3+numero4);
    }
    
    public static int divisaoParametros(int numero2, int numero3, int numero4){
        int resultadoAdicao = numero2 / numero3 / numero4;
        return resultadoAdicao;
    }
public static boolean frio (boolean estaFrio){
    if (estaFrio == true){
        return false;
    }
    else{

    }
    return true;
}
public static void main(String[] args) {
    int numero2 = 20;
    int numero3 = 30;
    int numero4 = 40;
    somaParametros(numero2, numero3, numero4);
    System.out.println(divisaoParametros(numero2, numero3, numero4));
    System.out.println(frio(true));
}

public static boolean maior (boolean maiorOuMenor){
    if (maiorOuMenor == false){
        return true;
    }
else{

}
return false;
}

}

