package gameTrial.movingSprites;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {

    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean visible;
    protected Image image;

    /**
     * A sprite.
     * @param x the x coordinate the sprite is created at.
     * @param y the y coordinate the sprite is created at.
     */
    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
        visible = true;
    }

    /**
     * Gets the dimensions of the image.
     */
    protected void getImageDimensions() {
        width = image.getWidth(null);
        height = image.getHeight(null);
    }

    /**
     * Loads the image by getting it from an ImageIcon.
     * @param imageName location of the image to be loaded.
     */
    protected void loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }

    /**
     * Returns the image of the Sprite.
     * @return image of the Sprite.
     */
    public Image getImage() {
        return image;
    }

    /**
     * Returns the x coordinate of the sprite.
     * @return the x coordinate of the sprite
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y coordinate of the sprite.
     * @return the y coordinate of the sprite
     */
    public int getY() {
        return y;
    }

    /**
     * Returns whether or not the sprite is visible.
     * @return boolean stating visibility
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * sets the visiblilty of the sprite to visibile.
     * @param visible true or false
     */
    public void setVisible(Boolean visible) {
        this.visible=visible;
    }
}
