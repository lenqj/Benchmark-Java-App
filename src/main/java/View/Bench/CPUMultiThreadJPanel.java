package View.Bench;

import javax.swing.*;

public class CPUMultiThreadJPanel extends JPanel{
    public CPUMultiThreadJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("CPUMultiThreadJPanel"));
        add(panel);
    }
}
