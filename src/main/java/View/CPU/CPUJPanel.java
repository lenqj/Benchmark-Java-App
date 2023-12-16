package View.CPU;

import javax.swing.*;
import java.awt.*;

public class CPUJPanel extends JPanel {
    private final ProcessorJPanel processorJPanel;
    private final ClocksJPanel clocksJPanel;
    private final  CacheJPanel cacheJPanel;
    public CPUJPanel() {
        JPanel contentPanel = new JPanel();
        processorJPanel = new ProcessorJPanel();
        clocksJPanel = new ClocksJPanel();
        cacheJPanel = new CacheJPanel();
        contentPanel.setLayout(new GridLayout(2, 1));
        contentPanel.add(processorJPanel);
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        bottomPanel.add(clocksJPanel);
        bottomPanel.add(cacheJPanel);
        contentPanel.add(bottomPanel);
        add(contentPanel);
    }

    public void setNameJLabel(String text){
        processorJPanel.setNameJLabel(text);
    }
    public void setVendorJLabel(String text){
        processorJPanel.setVendorJLabel(text);
    }
    public void setFamilyJLabel(String text){
        processorJPanel.setFamilyJLabel(text);
    }
    public void setProcessorIDJLabel(String text){
        processorJPanel.setProcessorIDJLabel(text);
    }
    public void setIdentifierJLabel(String text){
        processorJPanel.setIdentifierJLabel(text);
    }
    public void setCacheL1Label(String text) {
        cacheJPanel.setCacheL1Label(text);
    }

    public void setCacheL2Label(String text) {
        cacheJPanel.setCacheL2Label(text);
    }

    public void setCacheL3Label(String text) {
        cacheJPanel.setCacheL3Label(text);
    }
    public void setProcessorFrequencyJLabel(String text) {
        clocksJPanel.setProcessorFrequencyJLabel(text);
    }
}
