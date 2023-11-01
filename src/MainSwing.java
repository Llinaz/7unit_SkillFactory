import javax.swing.*;

public class MainSwing {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400,300);
//        jFrame.addMouseListener(new SimpleClickListener());
        jFrame.setVisible(true);
        SimpleClickListener mouseListener = new SimpleClickListener();
        jFrame.addMouseListener(mouseListener);
    }
}