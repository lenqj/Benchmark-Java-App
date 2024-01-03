package View.CPU;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ClocksJPanel extends JPanel{
    private final JLabel frequencyJLabel;
    ClocksJPanel(){
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(170, 90));
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "Clocks"));
        panel.setLayout(new GridLayout(1, 2));
        frequencyJLabel = new JLabel();
        panel.add(new JLabel("Core speed "));
        panel.add(frequencyJLabel);
        add(panel);
    }
    void setProcessorFrequencyJLabel(String text) {
        frequencyJLabel.setText(text);
    }

}

