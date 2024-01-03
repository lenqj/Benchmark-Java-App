package View.Bench;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class BenchmarkJPanel extends JPanel{
    private JButton benchButton;
    private JLabel benchResultJLabel;
    public BenchmarkJPanel() {
        JPanel panel = new JPanel();
        //panel.setPreferredSize(new Dimension(170, 250));
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "Benchmark"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        benchButton = new JButton("BENCH");
        benchResultJLabel = new JLabel();
        panel.add(benchButton);
        panel.add(benchResultJLabel);
        add(panel);
    }
    void addBenchButtonListener(ActionListener benchButtonListener){
        benchButton.addActionListener(benchButtonListener);
    }
    void setBenchResultJLabel(String text){
        benchResultJLabel.setText(text);
    }
}
