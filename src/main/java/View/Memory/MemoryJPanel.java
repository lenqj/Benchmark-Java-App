package View.Memory;

import javax.swing.*;

public class MemoryJPanel extends JPanel {
    GeneralJPanel generalJPanel;
    TimingsJPanel timingsJPanel;
    public MemoryJPanel() {
        JPanel contentPanel = new JPanel();
        generalJPanel = new GeneralJPanel();
        timingsJPanel = new TimingsJPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.add(generalJPanel);
        contentPanel.add(timingsJPanel);
        add(contentPanel);
    }

    public void setRAMFrequencyJLabel(String text) {
        timingsJPanel.setRAMFrequencyJLabel(text);
    }
    public void setRAMBankJLabel(String text) {
        timingsJPanel.setRAMBankJLabel(text);
    }
    public void setRAMManufacturerJLabel(String text) {
        timingsJPanel.setRAMManufacturerJLabel(text);
    }
    public void setRAMSizeJLabel(String text) {
        generalJPanel.setRAMSizeJLabel(text);
    }
    public void setRAMTypeJLabel(String text) {
        generalJPanel.setRAMTypeJLabel(text);
    }
}
