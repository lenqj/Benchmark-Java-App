package View.Memory;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GeneralJPanel extends JPanel{
    private final JLabel size;
    private final JLabel type;
    public GeneralJPanel() {
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.setPreferredSize(new Dimension(320, 80));
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "General"));
        size = new JLabel();
        type = new JLabel();

        panel.add(new JLabel("Size"));
        panel.add(size);
        panel.add(new JLabel("Type"));
        panel.add(type);
        add(panel);
    }
    void setRAMSizeJLabel(String text) {
        size.setText(text);
    }
    void setRAMTypeJLabel(String text) {
        type.setText(text);
    }

}
