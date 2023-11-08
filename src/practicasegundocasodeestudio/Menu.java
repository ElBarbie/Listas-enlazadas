package practicasegundocasodeestudio;

import javax.swing.JOptionPane;

public class Menu {
    int op = 1;
    ListaLibros ll = new ListaLibros();
    ListaCategorias lc = new ListaCategorias();

    public void menu() {
        while (op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú Principal\n\n"
                    + "1. Agregar categoria\n"
                    + "2. Agregar libro a una categoria\n"
                    + "3. Verificar categoria\n"
                    + "4. Verificar libro\n"
                    + "0. Salir del sistema\n"
                    + "\nDigite una opción para continuar:...",
                    "Lista Enlazada Simple", JOptionPane.QUESTION_MESSAGE));
            switch (op) {
                case 1:
                    lc.insertar();
                    lc.agregarlista():
                    break;
                case 2:
                    ls.extraer();
                    break;
                case 3:
                    String nombre = JOptionPane.showInputDialog("Digite el nombre de la categoria:");
                    lc.existe(nombre);
                    break;
                case 4:
                    ls.mostrar();
                    break;
                case 0:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Error opción invalida", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}