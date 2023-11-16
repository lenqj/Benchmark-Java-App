package View.Graphics;

import javax.swing.*;

public class GPUJPanel extends JPanel {
    public GPUJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("GPUJPanel"));
        add(panel);
    }
}
