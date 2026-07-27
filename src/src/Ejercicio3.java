import javax.swing.*;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Consultar saldo\n" +
                            "2. Retirar dinero\n" +
                            "3. Depositar dinero\n" +
                            "4. Salir"));

            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Consultando saldo...");
            }

            if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Retirando dinero...");
            }

            if (opcion == 3) {
                JOptionPane.showMessageDialog(null, "Depositando dinero...");
            }

            if (opcion == 4) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el cajero.");
            }

            if (opcion < 1 || opcion > 4) {
                JOptionPane.showMessageDialog(null, "Opción no válida.");
            }

        } while (opcion != 4);

    }
}