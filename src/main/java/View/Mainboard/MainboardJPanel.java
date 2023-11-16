package View.Mainboard;

import View.Bench.BenchmarkJPanel;
import View.Bench.CPUMultiThreadJPanel;
import View.Bench.CPUSingleThreadJPanel;

import javax.swing.*;

public class MainboardJPanel extends JPanel {
    BIOSJPanel biosJPanel;
    MotherboardJPanel motherboardJPanel;
    public MainboardJPanel() {
        JPanel contentPanel = new JPanel();
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        biosJPanel = new BIOSJPanel();
        motherboardJPanel = new MotherboardJPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        topPanel.add(biosJPanel);
        topPanel.add(motherboardJPanel);
        contentPanel.add(topPanel);
        add(contentPanel);
    }
}
