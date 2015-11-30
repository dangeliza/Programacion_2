//se invoca a la libreria que permite el uso del objeto JOptionPane

//para la captura y presentacion de datos en una interface grafica de
//usuario.
import javax.swing.JOptionPane;

public class corridaErr {
    
    //metodo principal de la clase que permite ejecutar el programa y
    //probar el codigo de control de errores.
    public static void main(String[] args) {
        //Se declaran las variables para captura de datos
        int val1=0, val2=0, resu = 0;
        int vec[] = new int[4];
        try{
            val1 = Integer.parseInt(JOptionPane.
                    showInputDialog("Digite un número"));
            
            val2 = Integer.parseInt(JOptionPane.
                    showInputDialog("Digite otro número"));
            
            resu = val1 / val2;
            vec[4] = resu;
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,
                    "Error: "+ex.getMessage());
        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null,
                    "Error: "+ex.getMessage());
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null,
                    "Error: Accediendo al vector en la posición "+
                            ex.getMessage());
        }finally{
            JOptionPane.showMessageDialog(null,
                    "El resultado es: " + resu);
        }
        
        
    }//fin del metodo principal
}//fin de la clase de prueba de errores.