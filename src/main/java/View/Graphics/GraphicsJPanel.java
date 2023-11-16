package View.Graphics;

import javax.swing.*;

public class GraphicsJPanel extends JPanel {
    DisplayDeviceSelectionJPanel displayDeviceSelectionJPanel;
    GPUJPanel gpuJPanel;
    ClocksJPanel clocksJPanel;
    MemoryJPanel memoryJPanel;
    public GraphicsJPanel() {
        JPanel contentPanel = new JPanel();
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        displayDeviceSelectionJPanel = new DisplayDeviceSelectionJPanel();
        gpuJPanel = new GPUJPanel();
        clocksJPanel = new ClocksJPanel();
        memoryJPanel = new MemoryJPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        topPanel.add(displayDeviceSelectionJPanel);
        topPanel.add(gpuJPanel);
        topPanel.add(clocksJPanel);
        topPanel.add(memoryJPanel);
        contentPanel.add(topPanel);
        add(contentPanel);
    }
}
