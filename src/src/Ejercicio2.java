import javax.swing.*;

public class Ejercicio2 {
    public static void main (String [] args){

        double nota;
        double suma = 0;
        double promedio ;
        int cantidad = 0;

        do {

            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una nota (-1 para terminar) : "));

            if ( nota!= -1){
                suma = suma + nota;
                cantidad++;
            }

            } while ( nota!= -1);

        if ( cantidad > 0 ) {
            promedio = suma / cantidad;

            JOptionPane.showMessageDialog(null, "Cantidad de notas: " + cantidad + "\nSuma: " + suma + "\nPromedio: " + promedio);

        }else{
            JOptionPane.showMessageDialog(null, "No se ingresaron las notas. ");

         }
        }
    }
