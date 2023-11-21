package View.CPU;

import javax.swing.*;

public class CPUJPanel extends JPanel {
    ProcessorJPanel processorJPanel;
    ClocksJPanel clocksJPanel;
    CacheJPanel cacheJPanel;
    public CPUJPanel() {
        JPanel contentPanel = new JPanel();
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        processorJPanel = new ProcessorJPanel();
        clocksJPanel = new ClocksJPanel();
        cacheJPanel = new CacheJPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        topPanel.add(processorJPanel);
        topPanel.add(clocksJPanel);
        topPanel.add(cacheJPanel);
        contentPanel.add(topPanel);
        add(contentPanel);
    }

    public void setNameTextArea(String textArea){
        processorJPanel.setNameTextArea(textArea);
    }
    public void setVendorTextArea(String textArea){
        processorJPanel.setVendorTextArea(textArea);
    }
    public void setFamilyTextArea(String textArea){
        processorJPanel.setFamilyTextArea(textArea);
    }
    public void setProcessorIDTextArea(String textArea){
        processorJPanel.setProcessorIDTextArea(textArea);
    }

    public void setIdentifierTextArea(String textArea){
        processorJPanel.setIdentifierTextArea(textArea);
    }
}
