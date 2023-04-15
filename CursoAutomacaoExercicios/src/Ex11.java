public class Ex11 {
    public static String texto(String primeiroTexto, String segundoTexto){
        String resultado = "primeiroTexto" + "segundoTexto";
        return resultado;
    }
    public static void main(String [] args){
        String primeiroTexto = "Primeiro texto leitura";
        String segundoTexto = "Segundo texto concatena";
        System.out.println(texto(primeiroTexto , segundoTexto));
    }

    public static boolean maiorQueCem(int valor1,  int valor2){
        int resultado = valor1+valor2;
        if(resultado>100){
            return true;
            
        }
        else{
            return false;
        }
    }

    int valor1= 12;
    int valor2 = 8;
    
    
    
    }
    
    

