package Task4.Examples;

import javax.swing.*;
import java.awt.*;

public class BorderExample extends JFrame {
    JPanel[] pn1 = new JPanel[12];

    public BorderExample(){
        setLayout(new GridLayout(3, 4));
        for (int i = 0; i < pn1.length; i++){
            int r = (int) (Math.random()*255);
            int g = (int) (Math.random()*255);
            int b = (int) (Math.random()*255);
            pn1[i] = new JPanel();
            pn1[i].setBackground(new Color(r,g,b));
            add(pn1[i]);
        }

        pn1[4].setLayout(new BorderLayout());
        pn1[4].add(new JButton("one"), BorderLayout.WEST);
        pn1[4].add(new JButton("two"), BorderLayout.EAST);
        pn1[4].add(new JButton("three"), BorderLayout.SOUTH);
        pn1[4].add(new JButton("four"), BorderLayout.NORTH);
        pn1[4].add(new JButton("five"), BorderLayout.CENTER);

        pn1[10].setLayout(new FlowLayout());
        pn1[10].add(new JButton("one"));
        pn1[10].add(new JButton("two"));
        pn1[10].add(new JButton("three"));
        pn1[10].add(new JButton("four"));
        pn1[10].add(new JButton("five"));
        pn1[10].add(new JButton("six"));

        setSize(800, 500);
    }

    public static void main(String[] args) {
        new BorderExample().setVisible(true);
    }
}
