package Task4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchScore extends JFrame {
    private int milanScore = 0;
    private int realScore = 0;
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    JButton butMilan = new JButton("AC Milan");
    JButton butReal = new JButton("Real Madrid");

    JLabel score = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");

    JPanel[] pnl = new JPanel[15];

    public MatchScore(){
        super("Match score");
        score.setFont(fnt);
        winner.setFont(fnt);
        lastScorer.setFont(fnt);
        butReal.setFont(fnt);
        butMilan.setFont(fnt);
        setSize(800, 400);
        setLayout(new GridLayout(5, 3));

        for (int i = 0; i < pnl.length; i++){
            pnl[i] = new JPanel();
            pnl[i].setBackground(Color.lightGray);
            add(pnl[i]);
        }

        pnl[0].add(lastScorer);
        pnl[0].setBackground(Color.pink);

        pnl[1].add(score);
        pnl[1].setBackground(Color.pink);

        pnl[2].add(winner);
        pnl[2].setBackground(Color.pink);

        pnl[12].add(butMilan);
        pnl[12].setBackground(Color.gray);
        pnl[13].setBackground(Color.gray);
        pnl[14].add(butReal);
        pnl[14].setBackground(Color.gray);

        butMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer.setText("Last Scorer: AC Milan");
                winner.setText(getWinner());
                score.setText("Result: " + milanScore + " X " + realScore);
            }
        });

        butReal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realScore++;
                lastScorer.setText("Last Scorer: Real Madrid");
                winner.setText(getWinner());
                score.setText("Result: " + milanScore + " X " + realScore);
            }
        });
    }

    private String getWinner(){
        if (milanScore == realScore)
            return "Winner: DRAW";
        else if (milanScore > realScore)
            return "Winner: AC Milan";
        else
            return "Winner: Real Madrid";
    }

    public static void main(String[] args) {
        new MatchScore().setVisible(true);
    }

}
