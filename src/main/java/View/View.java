package View;


import Controller.Listeners;
import View.Bench.BenchJPanel;
import View.CPU.CPUJPanel;
import View.Graphics.GraphicsJPanel;
import View.Memory.MemoryJPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class View extends JFrame {
    public static CPUJPanel cpuJPanel;
    public static MemoryJPanel memoryJPanel;
    public static GraphicsJPanel graphicsJPanel;
    public static BenchJPanel benchJPanel;
    public static JPanel contentJPanel;
    private static CardLayout cardLayout;
    private static JMenuItem cpuJMenuItem;
    private static JMenuItem memoryJMenuItem;
    private static JMenuItem graphicsJMenuItem;
    private static JMenuItem benchJMenuItem;
    public View() {
        setSize(600, 320);
        setTitle("CPU-Z");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainJPanel = new JPanel();

        cpuJPanel = new CPUJPanel();
        memoryJPanel = new MemoryJPanel();
        graphicsJPanel = new GraphicsJPanel();
        benchJPanel = new BenchJPanel();

        cardLayout = new CardLayout();

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.LIGHT_GRAY);
        super.setJMenuBar(menuBar);

        cpuJMenuItem = new JMenuItem("CPU");
        memoryJMenuItem = new JMenuItem("Memory");
        graphicsJMenuItem = new JMenuItem("Graphics");
        benchJMenuItem = new JMenuItem("Bench");

        menuBar.add(cpuJMenuItem);
        menuBar.add(memoryJMenuItem);
        menuBar.add(graphicsJMenuItem);
        menuBar.add(benchJMenuItem);

        contentJPanel = new JPanel();
        contentJPanel.setLayout(cardLayout);

        contentJPanel.add(cpuJPanel, "0");
        contentJPanel.add(memoryJPanel, "1");
        contentJPanel.add(graphicsJPanel, "2");
        contentJPanel.add(benchJPanel, "3");


        cardLayout.show(contentJPanel, "0");

        mainJPanel.add(contentJPanel, BorderLayout.CENTER);
        setContentPane(mainJPanel);
    }
    public static void setCurrentJPanel(String id){
        cardLayout.show(contentJPanel, id);
    }
    public static void setNameJLabel(String text){
        cpuJPanel.setNameJLabel(text);
    }
    public static void setVendorJLabel(String text){
        cpuJPanel.setVendorJLabel(text);
    }
    public static void setFamilyJLabel(String text){
        cpuJPanel.setFamilyJLabel(text);
    }
    public static void setProcessorIDJLabel(String text){
        cpuJPanel.setProcessorIDJLabel(text);
    }
    public static void setIdentifierJLabel(String text){
        cpuJPanel.setIdentifierJLabel(text);
    }
    public static void setCacheL1Label(String text) {
        cpuJPanel.setCacheL1Label(text);
    }
    public static void setCacheL2Label(String text) {
        cpuJPanel.setCacheL2Label(text);
    }
    public static void setCacheL3Label(String text) {
        cpuJPanel.setCacheL3Label(text);
    }
    public static void setProcessorFrequencyJLabel(String text) {
        cpuJPanel.setProcessorFrequencyJLabel(text);
    }
    public static void setGPUNameList(List<String> nameListGPU){
        graphicsJPanel.setNameList(nameListGPU);
    }
    public static void setGPUNameJLabel(String name){
        graphicsJPanel.setNameJLabel(name);
    }
    public static void setBoardManufactureJLabel(String name){
        graphicsJPanel.setBoardManufactureJLabel(name);
    }
    public static void setDriverJLabel(String name){
        graphicsJPanel.setDriverJLabel(name);
    }
    public static void setVRAMJLabel(String name){
        graphicsJPanel.setVRAMJLabel(name);
    }
    public static void setRAMFrequencyJLabel(String text) {
        memoryJPanel.setRAMFrequencyJLabel(text);
    }
    public static void setRAMBankJLabel(String text) {
        memoryJPanel.setRAMBankJLabel(text);
    }
    public static void setRAMManufacturerJLabel(String text) {
        memoryJPanel.setRAMManufacturerJLabel(text);
    }
    public static void setRAMSizeJLabel(String text) {
        memoryJPanel.setRAMSizeJLabel(text);
    }
    public static void setRAMTypeJLabel(String text) {
        memoryJPanel.setRAMTypeJLabel(text);
    }
    public static void addJMenuListeners(){
        cpuJMenuItem.addActionListener(new Listeners.CPUJMenuListener());
        memoryJMenuItem.addActionListener(new Listeners.MemoryJMenuListener());
        graphicsJMenuItem.addActionListener(new Listeners.GraphicsJMenuListener());
        benchJMenuItem.addActionListener(new Listeners.BenchJMenuListener());
    }
    public static void addButtonsListeners(){
        benchJPanel.addButtonsListeners(new Listeners.BenchButtonListener());
    }

    public static void setBenchResultJLabel(String text){
        benchJPanel.setBenchResultJLabel(text);
    }
}

