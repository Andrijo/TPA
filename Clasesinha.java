package Paquetinho;

import javax.swing.JFrame;

/**
 *
 * @author invitado
 */
public class Clasesinha extends JFrame {

    public Clasesinha() {
        super("This Is A Framework");
        this.setVisible(true);
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Pack(); Se acopla al tamaño de sus componentes

    }

    public static void main(String[] args) {
        Clasesinha op = new Clasesinha();
    }
}
