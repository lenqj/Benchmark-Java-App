package View.Memory;

import javax.swing.*;

public class GeneralJPanel extends JPanel{
    public GeneralJPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("GeneralJPanel"));
        add(panel);
    }
}
