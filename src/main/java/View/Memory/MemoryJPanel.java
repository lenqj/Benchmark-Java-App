package View.Memory;

import View.Mainboard.BIOSJPanel;
import View.Mainboard.MotherboardJPanel;

import javax.swing.*;

public class MemoryJPanel extends JPanel {
    GeneralJPanel generalJPanel;
    TimingsJPanel timingsJPanel;
    public MemoryJPanel() {
        JPanel contentPanel = new JPanel();
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        generalJPanel = new GeneralJPanel();
        timingsJPanel = new TimingsJPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        topPanel.add(generalJPanel);
        topPanel.add(timingsJPanel);
        contentPanel.add(topPanel);
        add(contentPanel);
    }
}
