package Task4.Examples;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextAreaExample extends JFrame {
    JTextArea jta1 = new JTextArea(10,25);
    JButton button = new JButton("Add some Text");

    JScrollPane jScroll = new JScrollPane(jta1);
    public TextAreaExample(){
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(button);
        add(jScroll);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String txt = JOptionPane.showInputDialog(null, "Insert some text");
                jta1.append(txt);
            }
        });
    }

    public static void main(String[] args) {
        new TextAreaExample().setVisible(true);
    }


}
