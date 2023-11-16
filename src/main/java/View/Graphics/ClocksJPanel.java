package View.Graphics;

import javax.swing.*;

public class ClocksJPanel extends JPanel {
    public ClocksJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("ClocksJPanel"));
        add(panel);
    }
}
