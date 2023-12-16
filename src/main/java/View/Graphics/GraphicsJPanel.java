package View.Graphics;

import javax.swing.*;
import java.util.List;

public class GraphicsJPanel extends JPanel {
    DisplayDeviceSelectionJPanel displayDeviceSelectionJPanel;
    GPUJPanel gpuJPanel;
    public GraphicsJPanel() {
        JPanel contentPanel = new JPanel();
        displayDeviceSelectionJPanel = new DisplayDeviceSelectionJPanel();
        gpuJPanel = new GPUJPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        contentPanel.add(displayDeviceSelectionJPanel);
        contentPanel.add(gpuJPanel);
        add(contentPanel);
    }
    public void setNameList(List<String> nameListGPU){
        displayDeviceSelectionJPanel.setNameList(nameListGPU);
    }
    public void setNameJLabel(String text) {
        gpuJPanel.setNameJLabel(text);
    }
    public void setDriverJLabel(String name){
        gpuJPanel.setDriverJLabel(name);
    }
    public void setVRAMJLabel(String name){
        gpuJPanel.setVRAMJLabel(name);
    }
    public void setBoardManufactureJLabel(String text) {
        gpuJPanel.setBoardManufactureJLabel(text);
    }


}
