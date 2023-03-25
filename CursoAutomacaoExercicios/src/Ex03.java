import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite primeiro nome");
        String sobrenome = JOptionPane.showInputDialog("Digite um sobrenome");
        String  Nome1 = nome;
        nome =  sobrenome;
        sobrenome = Nome1;
        Nome1 = nome;
        System.out.println("Primeiro valor: "+nome);
        System.out.println("Segundo valor: "+sobrenome);
        

       

        
    }


}
