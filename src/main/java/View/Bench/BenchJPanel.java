package View.Bench;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BenchJPanel extends JPanel {
    BenchmarkJPanel benchmarkJPanel;
    public BenchJPanel() {
        JPanel contentPanel = new JPanel(new GridLayout(3, 1));
        benchmarkJPanel = new BenchmarkJPanel();
        contentPanel.add(benchmarkJPanel);
        add(contentPanel);
    }
    public void addButtonsListeners(ActionListener benchButtonListener){
        benchmarkJPanel.addBenchButtonListener(benchButtonListener);
    }

    public void setBenchResultJLabel(String text){
        benchmarkJPanel.setBenchResultJLabel(text);
    }

}
