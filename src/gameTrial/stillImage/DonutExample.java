package gameTrial.stillImage;

import java.awt.EventQueue;
import javax.swing.*;

public class DonutExample extends JFrame {

    public DonutExample() {
        initUI();
    }

    public void initUI() {
        add(new DonutBoard());

        setSize(330, 330);

        setTitle("Donut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()-> {
            DonutExample ex = new DonutExample();
            ex.setVisible(true);
        });
    }
}
