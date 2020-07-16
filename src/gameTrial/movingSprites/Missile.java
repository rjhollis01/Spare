package gameTrial.movingSprites;

public class Missile extends Sprite{
    private final int BOARD_WIDTH = 390;
    private final int MISSILE_SPEED = 2;

    /**
     * A missile is a projectile that is shot from a spaceShip. Missile inherits methods from the Sprite class.
     * Used in Board and SpaceShip.
     * @param x the x coordinate a missile is launched from
     * @param y the y coordinate a missile is launched from
     */
    public Missile(int x, int y) {
        super(x, y);

        initMissile();
    }

    /**
     * Calls the loadImage method and getImageDimension methods from Sprite.
     */
    private void initMissile() {
        loadImage("src/gameTrial/movingSprites/missile.png");
        getImageDimensions();
    }

    /**
     * Moves the missile by incrementing its x position by MISSILE_SPEED. If the missile passes the border of the
     * screen, visible is set to false.
     */
    public void move () {
        x+= MISSILE_SPEED;

        if(x>BOARD_WIDTH) {
            visible = false;
        }
    }
}
