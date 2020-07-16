package gameTrial.movingSprites;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * Applicator class for SpaceShip, Missile, Board.
 */
public class ShootingMissilesEx extends JFrame{
    public ShootingMissilesEx() {
        initUI();
    }

    /**
     * Creates a new Board with a set size. The window is not resizable. The title is set to "Shooting Missiles"
     * When the window is closed, the process finishes.
     */
    private void initUI() {
        add(new Board() );
        setSize(400,300);
        setResizable(false);

        setTitle("Shooting Missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Creates an instance of ShootingMissilesEx, and sets its visibility to true.
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(()-> {
            ShootingMissilesEx ex = new ShootingMissilesEx();
            ex.setVisible(true);
        });
    }
}
