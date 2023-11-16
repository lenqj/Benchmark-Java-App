package View.Bench;
import javax.swing.*;

public class BenchJPanel extends JPanel {
    BenchmarkJPanel benchmarkJPanel;
    CPUSingleThreadJPanel cpuSingleThreadJPanel;
    CPUMultiThreadJPanel cpuMultiThreadJPanel;
    public BenchJPanel() {
        JPanel contentPanel = new JPanel();
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        benchmarkJPanel = new BenchmarkJPanel();
        cpuSingleThreadJPanel = new CPUSingleThreadJPanel();
        cpuMultiThreadJPanel = new CPUMultiThreadJPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        topPanel.add(benchmarkJPanel);
        topPanel.add(cpuSingleThreadJPanel);
        topPanel.add(cpuMultiThreadJPanel);
        contentPanel.add(topPanel);
        add(contentPanel);
    }
    public void addButtonsListeners(){}

}
