import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MainSwing {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,300);
//        jFrame.addMouseListener(new SimpleClickListener());
        jFrame.setVisible(true);
        SimpleClickListener mouseListener = new SimpleClickListener();
//        jFrame.addMouseListener(mouseListener);
        jFrame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println(e.getX() + " " + e.getY());
            }
        });
    }
}