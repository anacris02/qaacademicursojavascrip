
import javax.swing.JOptionPane;

public class Ex09 {
    public static void main(String[] args) throws Exception {
     int number = Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro numero"));   
        
    int i = 0;
    int numero = 0;

        while(i<=10){

            numero = number *i;
            System.out.println(numero);
            i=i+1;

        }



    }
    
}
