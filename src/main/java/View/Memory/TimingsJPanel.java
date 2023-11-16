package View.Memory;

import javax.swing.*;

public class TimingsJPanel extends JPanel{
    public TimingsJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("TimingsJPanel"));
        add(panel);
    }
}
