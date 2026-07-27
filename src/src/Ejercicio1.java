import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        String contrasenaCorrecta = "1234";
        String contrasena;

        do {
            contrasena = JOptionPane.showInputDialog("Ingrese la contraseña:");

        } while (!contrasena.equals(contrasenaCorrecta));

        JOptionPane.showMessageDialog(null, "Acceso permitido");
    }
}
//el .equals es para comparar dos cadenas de texto y para comparar los numeros usamos ==