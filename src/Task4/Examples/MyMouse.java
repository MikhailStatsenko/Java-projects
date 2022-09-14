package Task4.Examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouse extends JFrame {
    JLabel lbl = new JLabel("");

    public MyMouse(){
        super("Dude! Where's my mouse?");
        setSize(400, 400);
        setLayout(new BorderLayout());
        add(lbl, BorderLayout.SOUTH);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl.setText("X=" + e.getX() + " Y=" + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    public static void main(String[] args) {
        new MyMouse().setVisible(true);
    }
}
