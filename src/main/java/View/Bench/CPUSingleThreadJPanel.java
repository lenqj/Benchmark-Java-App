package View.Bench;

import javax.swing.*;

public class CPUSingleThreadJPanel extends JPanel{
    public CPUSingleThreadJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("CPUSingleThreadJPanel"));
        add(panel);
    }
}
