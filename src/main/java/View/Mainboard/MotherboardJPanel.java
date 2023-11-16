package View.Mainboard;

import javax.swing.*;

public class MotherboardJPanel extends JPanel{
    public MotherboardJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("MotherboardJPanel"));
        add(panel);
    }
}
