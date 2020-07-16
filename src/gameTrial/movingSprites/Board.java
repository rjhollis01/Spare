package gameTrial.movingSprites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * This is the Board for a SpaceShip that can shoot Missiles. The applicator for this Board is ShootingMissilesEx
 * This class extends JPanel
 */
public class Board extends JPanel implements ActionListener {
    private final int ICRAFT_X = 40;
    private final int ICRAFT_Y = 60;
    private final int DELAY = 10;
    private Timer timer;
    private SpaceShip spaceShip;

    /**
     * Creates a Board for SpaceShip and Missile
     */
    public Board() {
        initBoard();
    }

    /**
     * Creates a new KeyListener
     * Sets the background to black
     * Creates a new spaceship
     * Starts a timer for animation
     */
    private void initBoard() {
        addKeyListener(new TAdapter());
        setBackground(Color.BLACK);
        setFocusable(true);

        spaceShip = new SpaceShip(ICRAFT_X, ICRAFT_Y);

        timer = new Timer(DELAY, this);
        timer.start();
    }

    /**
     * Calls the doDrawing method
     * @param g the Graphics object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    /**
     * Draws SpaceShip and available Missiles onto the Board
     * @param g
     */
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(spaceShip.getImage(), spaceShip.getX(), spaceShip.getY(), this);

        List<Missile> missiles = spaceShip.getMissiles();

        for (Missile missile: missiles) {
            g2d.drawImage(missile.getImage(), missile.getX(), missile.getY(), this);
        }
    }

    /**
     * Performed every DELAY milliseconds, calls the methods actionPerformed and
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

        updateMissiles();
        updateSpaceShip();

        repaint();
    }

    /**
     * Goes through an Arraylist of missiles. If a missile is visible, it is moved. If it is not, then it is removed.
     */
    private void updateMissiles() {
        List<Missile> missiles = spaceShip.getMissiles();

        for(int i = 0; i<missiles.size(); i++) {
            Missile missile = missiles.get(i);
            if(missile.isVisible()) {
                missile.move();
            } else {
                missiles.remove(i);
            }
        }
    }

    /**
     * Moves the SpaceShip
     */
    private void updateSpaceShip() {
        spaceShip.move();
    }

    /**
     * Overrides the KeyAdapter's methods of keyReleased and keyPressed via a new adapter
     */
    private class TAdapter extends KeyAdapter {
        public void keyReleased(KeyEvent e) {
            spaceShip.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            spaceShip.keyPressed(e);
        }
    }
}
