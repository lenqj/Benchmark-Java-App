package View.CPU;

import javax.swing.*;
public class CacheJPanel extends JPanel{
    CacheJPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("Cache"));
        add(panel);
    }
}

