import javax.swing.JOptionPane;

public class Exexertra {
    public static void main(String[] args) {
        String carro = JOptionPane.showInputDialog("Digite primeiro carro");
        String marca = JOptionPane.showInputDialog("Digite segundo  marca");
        String  carro2 = carro;
        carro = marca;
        marca = carro2;
        carro2 = carro;

        System.out.println("Primeiro valor: "+carro);
        System.out.println("Segundo valor: "+marca);

    
        
    }
        
        
        


}
