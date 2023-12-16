package View.Graphics;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class DisplayDeviceSelectionJPanel extends JPanel {
    private final JList<String> nameList;
    private final DefaultListModel<String> listModel;
    public DisplayDeviceSelectionJPanel() {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(320, 50));
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "Display Device Selection"));
        listModel = new DefaultListModel<>();
        nameList = new JList<String>(listModel);
        panel.add(nameList);
        add(panel);
    }
    public void setNameList(List<String> nameListGPU){
        for(String gpuName : nameListGPU){
            listModel.addElement(gpuName);
        }
    }
}
