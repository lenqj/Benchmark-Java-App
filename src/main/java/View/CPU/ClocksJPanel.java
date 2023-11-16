package View.CPU;
import javax.swing.*;

public class ClocksJPanel extends JPanel{
    ClocksJPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("Clocks"));
        add(panel);
    }
}

