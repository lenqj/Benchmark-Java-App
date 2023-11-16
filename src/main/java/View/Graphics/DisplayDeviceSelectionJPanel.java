package View.Graphics;

import javax.swing.*;

public class DisplayDeviceSelectionJPanel extends JPanel {
    public DisplayDeviceSelectionJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("DisplayDeviceSelectionJPanel"));
        add(panel);
    }
}
