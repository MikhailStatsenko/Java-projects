package Task21_22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private ICreateDocument createDocument;

    public Frame(ICreateDocument createDocument) {
        super("Editor");
        this.createDocument = createDocument;
        render();
    }

    private void render() {
        setSize(500, 700);
        setVisible(true);

        JMenu menu = new JMenu("File");
        JMenuItem newOption = new JMenuItem("New");
        JMenuItem openOption = new JMenuItem("Open");
        JMenuItem saveOption = new JMenuItem("Save");
        JMenuItem exitOption = new JMenuItem("Exit");
        menu.add(newOption);
        menu.add(openOption);
        menu.add(saveOption);
        menu.add(exitOption);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        newOption.addActionListener(new Frame.NewItemListener());
        openOption.addActionListener(new Frame.OpenItemListener());

        setJMenuBar(menuBar);
    }

    class NewItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            createDocument.createNew();
            System.out.println("Document created");
        }
    }

    class OpenItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            createDocument.createOpen();
            System.out.println("Document opened!");
        }
    }
}
