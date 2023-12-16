package View.CPU;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CacheJPanel extends JPanel{
    private final JLabel cacheL1Label;
    private final JLabel cacheL2Label;
    private final JLabel cacheL3Label;
    CacheJPanel(){
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "Cache"));
        cacheL1Label = new JLabel();
        cacheL2Label = new JLabel();
        cacheL3Label = new JLabel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new Label("L1"));
        panel.add(cacheL1Label);
        panel.add(new Label("L2"));
        panel.add(cacheL2Label);
        panel.add(new Label("L3"));
        panel.add(cacheL3Label);

        add(panel);
    }

    void setCacheL1Label(String text) {
        cacheL1Label.setText(text);
    }

    void setCacheL2Label(String text) {
        cacheL2Label.setText(text);
    }

    void setCacheL3Label(String text) {
        cacheL3Label.setText(text);
    }
}

