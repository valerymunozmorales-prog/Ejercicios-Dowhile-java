import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {

        double venta;
        double total = 0;
        int cantidad = 0;
        int respuesta;

        do {
            venta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta: "));

            total = total + venta;
            cantidad++;

            respuesta = Integer.parseInt(JOptionPane.showInputDialog("¿Desea registrar otra venta?\n1. Sí\n2. No"));

        } while (respuesta != 2);

        JOptionPane.showMessageDialog(null, "Ventas registradas: " + cantidad +
                        "\nTotal vendido: $" + total);
    }
}