import javax.swing.*;
import java.awt.*;


class Match extends JFrame {
    int mlSc  = 0;
    int mdSc = 0;
    JButton btn1 = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");
    JLabel txt1 = new JLabel("Result: 0 X 0");
    JLabel txt2 = new JLabel("Last Scorer: N/A");
    Label  txt3 = new Label("Winner: N/A");

    public Match() {
        super("Практическая Работа 4");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(250, 250);
        setLayout(new FlowLayout());
        add(btn1);
        add(btn2);
        add(txt1);
        add(txt2);
        add(txt3);

        btn1.addActionListener(ae -> {
            mlSc++;
            txt2.setText("Last Scorer: AC Milan");
            Results();
        });

        btn2.addActionListener(ae-> {
            mdSc++;
            txt2.setText("Last Scorer: Real Madrid");
            Results();
        });
    }

    void Results() {
        txt1.setText(String.format("Result: %d X %d", mlSc, mdSc));
        if (mlSc > mdSc) txt3.setText("Winner: AC Milan");
        else txt3.setText("Winner: Real Madrid");
    }
}
