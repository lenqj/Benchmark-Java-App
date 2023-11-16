package View.Mainboard;

import javax.swing.*;

public class BIOSJPanel extends JPanel{
    public BIOSJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("BIOSJPanel"));
        add(panel);
    }
}
