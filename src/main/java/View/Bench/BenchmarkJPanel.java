package View.Bench;

import javax.swing.*;

public class BenchmarkJPanel extends JPanel{
    public BenchmarkJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("BenchmarkJPanel"));
        add(panel);
    }
}
