package View.Graphics;

import javax.swing.*;

public class MemoryJPanel extends JPanel {
    public MemoryJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("MemoryJPanel"));
        add(panel);
    }
}
