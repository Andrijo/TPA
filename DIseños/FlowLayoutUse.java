package Diseños;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Andyzinho
 */
public class FlowLayoutUse extends JFrame {

    JButton bttn_one;
    JButton bttn_two;
    JButton bttn_exit;

    public FlowLayoutUse() {
        super("Uso de FlowLayout");

        bttn_one = new JButton("Uno");
        bttn_two = new JButton("Dos");
        bttn_exit = new JButton("Salir");

        /*
         int coordX = 10;
         int gap = 20;
         int width_bttn_one = bttn_one.getPreferredSize().width;
         bttn_one.setBounds(coordX, 200, width_bttn_one, 20);

         coordX += 150 + gap;
         bttn_two.setBounds(coordX, 200, width_bttn_one, 20);

         coordX += 150 + gap;
         bttn_exit.setBounds(coordX, 200, width_bttn_one, 20);
        
         */
        this.add(bttn_one);
        this.add(bttn_two);
        this.add(bttn_exit);
        
        bttn_exit.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
         
        //FlowLayout fly = new FlowLayout(FlowLayout.LEFT_ALIGNMENT);
        this.setLayout(new FlowLayout());
        this.pack();
        //this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        //this.setVisible(true);

    }

    public static void main(String[] args) {
        new FlowLayoutUse().setVisible(true);
    }
}
