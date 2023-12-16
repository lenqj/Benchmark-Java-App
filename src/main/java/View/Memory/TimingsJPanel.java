package View.Memory;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TimingsJPanel extends JPanel{
    private final JLabel frequency;
    private final JLabel bank;
    private final JLabel manufacturer;

    public TimingsJPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setPreferredSize(new Dimension(320, 100));
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "Timings"));
        frequency = new JLabel();
        bank = new JLabel();
        manufacturer = new JLabel();
        panel.add(new JLabel("DRAM Frequency "));
        panel.add(frequency);
        panel.add(new JLabel("BANK "));
        panel.add(bank);
        panel.add(new JLabel("Manufacturer "));
        panel.add(manufacturer);
        add(panel);
    }
    void setRAMFrequencyJLabel(String text) {
        frequency.setText(text);
    }
    void setRAMBankJLabel(String text) {
        bank.setText(text);
    }
    void setRAMManufacturerJLabel(String text) {
        manufacturer.setText(text);
    }


}
