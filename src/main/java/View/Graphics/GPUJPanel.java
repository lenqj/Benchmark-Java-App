package View.Graphics;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GPUJPanel extends JPanel {
    private final JLabel name;
    private final JLabel boardManufacture;
    private final JLabel driver;
    private final JLabel vram;
    public GPUJPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "GPU"));
        name = new JLabel();
        boardManufacture = new JLabel();
        driver = new JLabel();
        vram = new JLabel();
        panel.add(new JLabel("Name"));
        panel.add(name);
        panel.add(new JLabel("Board Manufacture"));
        panel.add(boardManufacture);
        panel.add(new JLabel("Driver"));
        panel.add(driver);
        panel.add(new JLabel("vRAM"));
        panel.add(vram);
        add(panel);
    }
    void setNameJLabel(String text) {
        name.setText(text);
    }
    public void setDriverJLabel(String name){
        driver.setText(name);
    }
    public void setVRAMJLabel(String name){
        vram.setText(name);
    }

    void setBoardManufactureJLabel(String text) {
        boardManufacture.setText(text);
    }
}
