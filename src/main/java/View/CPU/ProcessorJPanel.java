package View.CPU;

import javax.swing.*;

public class ProcessorJPanel extends JPanel{
    ProcessorJPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("Processor"));
        add(panel);
    }
}

