package Paneles;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Andyzinho
 */
public class App extends JFrame {

    //Componentes
    JPanel pnl_container;
    JPanel pnl_buttons;
    JPanel pnl_windows;
    JButton bttn_mainPage;
    JButton bttn_pageOne;
    JButton bttn_pageTwo;
    JButton bttn_exit;

    //Constructor
    public App() {
        super("Paneles en un JFrame");

        bttn_mainPage = new JButton("Principal");
        bttn_pageOne = new JButton("1");
        bttn_pageTwo = new JButton("2");
        bttn_exit = new JButton("Salir");

        pnl_container = new JPanel(null);
        pnl_container.setBounds(0, 0, 800, 600);

        pnl_buttons = new JPanel(null);
        pnl_buttons.setBounds(0, 0, 800, 100);

        pnl_windows = new JPanel(null);
        pnl_windows.setBounds(0, 101, 800, 500);

        int gap = 20;
        int coordX = 10;
        int coordY = 50;

        bttn_mainPage.setBounds(gap, gap, gap, gap);
        bttn_mainPage.addActionListener(null);

        coordX += 150 + gap;
        bttn_pageOne.setBounds(gap, gap, gap, gap);
        bttn_pageOne.addActionListener(null);

        coordX += 150 + gap;
        bttn_pageTwo.setBounds(gap, gap, gap, gap);
        bttn_pageTwo.addActionListener((ActionEvent e) -> {
            showPanels(new Index());
        });

        pnl_buttons.add(bttn_mainPage);
        pnl_buttons.add(bttn_pageOne);
        pnl_buttons.add(bttn_pageTwo);
        pnl_buttons.add(bttn_exit);

        pnl_container.add(pnl_buttons);
        pnl_container.add(pnl_windows);

        this.setLayout(null);
        this.setResizable(false);
    }

    public static void main(String[] args) {
        new App().setVisible(true);
    }

    private void showPanels(JPanel window) {
        window.setSize(800, 500);
        //window.
    }
}
