package Diseños;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author invitado
 */
public class BorderLayoutDesign extends JFrame {
    /*Titulo para la aplicacion, varias ventanas
     Norte, oeste y centro.
     Centro tendra tres penales, uno en el norte para subtitulos, centro para components, uno en el sur para los botones
     El oeste tendra un solo panel, con el desplazaremos en las distintas ventanas
     */

    //Componentes
    JPanel pnl_north;
    JPanel pnl_west;
    JPanel pnl_west_windows;
    JPanel pnl_center;
    JPanel pnl_center_subtitle;
    JPanel pnl_center_components;
    JPanel pnl_center_buttons;
    JButton bttn_exit;

    public BorderLayoutDesign() {
        super("Uso de BorderLayout");

        //Instanciaciones
        pnl_north = new JPanel();
        pnl_north.setBackground(Color.red);
        pnl_west = new JPanel();
        pnl_west.setBackground(Color.cyan);
        pnl_center = new JPanel();
        pnl_center_subtitle = new JPanel();
        pnl_center_subtitle.setBackground(Color.yellow);
        pnl_center_components = new JPanel();
        pnl_center_components.setBackground(Color.orange);
        pnl_center_buttons = new JPanel();
        pnl_center_buttons.setBackground(Color.blue);
        bttn_exit = new JButton("Salir");

        this.add(pnl_north);
        this.add(pnl_west);
        this.add(pnl_center);
        pnl_center.add(pnl_center_subtitle);
        pnl_center.add(pnl_center_components);
        pnl_center.add(pnl_center_buttons);
        pnl_west.add(bttn_exit);
        
        this.setLayout(null);
        //this.setLayout(new BorderLayout());
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        //this.pack();
    }

    public static void main(String[] args) {
        new BorderLayoutDesign().setVisible(true);
    }
}
