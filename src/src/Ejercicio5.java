import javax.swing.*;

public class Ejercicio5 {

        public static void main(String[] args) {

            double estatura;
            double suma = 0;
            double promedio;
            int cantidad = 0;
            int respuesta;

            do {

                estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura del estudiante:"));

                suma = suma + estatura;
                cantidad++;

                respuesta = Integer.parseInt(JOptionPane.showInputDialog( "¿Desea registrar otra estatura?\n1. Sí\n2. No"));

            } while (respuesta != 2);

            promedio = suma / cantidad;

            JOptionPane.showMessageDialog(null, "Cantidad de estudiantes: " + cantidad +
                            "\nPromedio de estaturas: " + promedio);

        }
    }