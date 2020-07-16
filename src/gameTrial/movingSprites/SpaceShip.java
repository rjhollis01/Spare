package gameTrial.movingSprites;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprite {
    private int dx;
    private int dy;
    private List<Missile> missiles;

    /**
     * Shoots missiles. Extends Sprite class. Used in Board.
     * @param x the x coordinate it is created at.
     * @param y the y coordinate it is created at.
     */
    public SpaceShip(int x, int y) {
        super (x, y);

        initSpaceShip();
    }

    /**
     * Calls the methods loadImage and getImageDimensions. Also initializes an ArrayList called missiles.
     */
    private void initSpaceShip() {
        missiles = new ArrayList<>();

        loadImage("src/gameTrial/movingSprites/spaceship.png");
        getImageDimensions();
    }

    /**
     * Moves the spaceShip by dx or dy when this method is called.
     */
    public void move() {
        x+=dx;
        y+=dy;
    }

    /**
     * A "getter" for missiles.
     * @return Missile.
     */
    public List<Missile> getMissiles() {
        return missiles;
    }

    /**
     * When a key is pressed, an action is performed. If the key pressed is the space bar, the fire method is called.
     * If the key pressed is left, dx is set to -1. If the key pressed is right, dx is set to 1.
     * If the key pressed is up, dy is set to -1. If the key pressed is down, dy is set to 1.
     * @param e
     */
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if(key==KeyEvent.VK_SPACE) {
            fire();
        }

        if(key==KeyEvent.VK_LEFT) {
            dx=-1;
        }

        if(key==KeyEvent.VK_RIGHT) {
            dx =1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    /**
     * Creates a new missile and adds it to the ArrayList missiles.
     */
    public void fire() {
        missiles.add(new Missile(x+width, y+height/2));
    }

    /**
     * When a key is released, an event occurs. If the key released is left or right, dx is set to 0;
     * If the key released is up or down, dy is set to 0.
     * @param e
     */
    public void keyReleased (KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
