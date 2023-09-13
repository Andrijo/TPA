package Aplicación;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
//import Aplicación.Fecha;
//import Aplicación.Recta;
//import Aplicación.Recta;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
//import javax.swing.SwingConstants;

/**
 *
 * @author Andyzinho
 */
public class Index extends JFrame {
    
    JLabel lbl_title;
    JLabel lbl_subtitle;
    JLabel lbl_exit;
    JPanel pnl_north;
    JPanel pnl_center;
    JPanel pnl_center_subtitle;
    JPanel pnl_center_components;
    JPanel pnl_center_buttons;
    JPanel pnl_west;
    JPanel pnl_west_navigation;
    JButton bttn_exit;
    JButton bttn_component_fecha;
    JButton bttn_component_recta;

    //@SuppressWarnings
    public Index() {
        super("Aplicación de diferentes paneles en una sola ventana");
        try {
            
            Font fnt_title = new Font("Roboto", Font.BOLD, 20);
            //Etiquetas
            lbl_title = new JLabel();
            lbl_title.setFont(fnt_title);
            lbl_title.setText("Título");
            lbl_subtitle = new JLabel();
            lbl_subtitle.setFont(fnt_title);
            lbl_subtitle.setText("Subtítulo");
            /*
             lbl_exit = new JLabel("Salir");
             //lbl_exit.setOpaque(true);
             lbl_exit.setFocusable(false);
             lbl_exit.setHorizontalAlignment(SwingConstants.CENTER);
             lbl_exit.setVerticalAlignment(SwingConstants.CENTER);
             lbl_exit.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
             // JOptionPane.showMessageDialog(null, "Botón JLabel");
             lbl_exit.setBackground(Color.red);
             System.exit(0);
             }
             /*
             @Override
             public void mousePressed(MouseEvent e) {
             lbl_exit.setBackground(Color.red);
             lbl_exit.setBorder(BorderFactory.createLoweredSoftBevelBorder());
             }

             @Override
             public void mouseReleased(MouseEvent e) {
             lbl_exit.setBackground(Color.red);
             lbl_exit.setBorder(BorderFactory.createRaisedBevelBorder());
             }
                 
             });
             */
            //Paneles
            pnl_north = new JPanel();
            //pnl_north.setBackground(Color.gray);
            pnl_center = new JPanel();
            pnl_center.setBackground(Color.cyan);
            pnl_center_subtitle = new JPanel();
            pnl_center_subtitle.setBackground(Color.green);
            pnl_center_components = new JPanel();
            pnl_center_components.setBackground(Color.yellow);
            pnl_center_buttons = new JPanel();
            pnl_center_buttons.setBackground(Color.gray);
            pnl_west = new JPanel();
            //pnl_west.setBackground(Color.orange);
            pnl_west_navigation = new JPanel();
            pnl_west_navigation.setBackground(Color.PINK);
            pnl_west_navigation.setSize(700, 80);

            //Botones
            bttn_exit = new JButton("Salir");
            bttn_exit.setFocusable(false);
            bttn_exit.addActionListener((ActionEvent e) -> {
                System.exit(0);
            });
            bttn_component_fecha = new JButton("Fecha");
            bttn_component_fecha.setFocusable(false);
            bttn_component_fecha.addActionListener((ActionEvent e) -> {
                lbl_subtitle.setText("Fecha");
            });
            bttn_component_recta = new JButton("Recta");
            bttn_component_recta.setFocusable(false);
            bttn_component_recta.addActionListener((ActionEvent e) -> {
                lbl_subtitle.setText("Recta");
            });

            //Adiciones
            this.add(pnl_north, BorderLayout.NORTH);
            this.add(pnl_center, BorderLayout.CENTER);
            this.add(pnl_west, BorderLayout.WEST);
            pnl_north.add(lbl_title);
            pnl_center.add(pnl_center_subtitle, BorderLayout.NORTH);
            pnl_center_subtitle.add(lbl_subtitle);
            pnl_center.add(pnl_center_components, BorderLayout.CENTER);
            pnl_center.add(pnl_center_buttons, BorderLayout.SOUTH);
            pnl_center_buttons.add(bttn_exit);
            //pnl_center_buttons.add(lbl_exit);
            pnl_west.add(pnl_west_navigation);
            pnl_west_navigation.add(bttn_component_fecha);
            pnl_west_navigation.add(bttn_component_recta);

            //Ajustes de JFrame
            this.setSize(700, 500);
            //this.pack();
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        } catch (Exception E) {
            System.out.println("Ocurrió el siguiente error:");
            System.out.println(E);
        }
        
    }
    
    public static void main(String[] args) {
        new Index().setVisible(true);
    }
}
