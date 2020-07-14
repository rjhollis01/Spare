package gameTrial.stillImage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImageBoard extends JPanel{

    private Image DreamKirb;

    public ImageBoard() {
        initBoard();
    }

    private void initBoard() {
        loadImage();

        int w = DreamKirb.getWidth(this);
        int h = DreamKirb.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("src/gameTrial/DreamKirb.png");
        DreamKirb = ii.getImage();
    }


    public void paintComponent(Graphics g) {
        g.drawImage(DreamKirb, 0, 0, null);
    }
}
