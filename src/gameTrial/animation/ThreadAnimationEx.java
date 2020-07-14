package gameTrial.animation;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class ThreadAnimationEx extends JFrame {
    //Thread animation is the most effective/accurate way of animation among the 3 I have but it doesn't work for some
    // reason? I don't know what's wrong.
    public ThreadAnimationEx() {

        initUI();
    }

    private void initUI() {

        add(new ThreadAnimationBoard());

        setResizable(false);
        pack();

        setTitle("Star");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new ThreadAnimationEx();
            ex.setVisible(true);
        });
    }
}
