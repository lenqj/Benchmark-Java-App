package View;


import Controller.Listeners;
import View.Bench.BenchJPanel;
import View.CPU.CPUJPanel;
import View.Graphics.GraphicsJPanel;
import View.Mainboard.MainboardJPanel;
import View.Memory.MemoryJPanel;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    public static JPanel cpuJPanel;
    public static JPanel mainboardJPanel;
    public static JPanel memoryJPanel;
    public static JPanel graphicsJPanel;
    public static JPanel benchJPanel;
    public static JPanel contentJPanel;
    private static CardLayout cardLayout;
    private static JMenuItem cpuJMenuItem;
    private static JMenuItem mainboardJMenuItem;
    private static JMenuItem memoryJMenuItem;
    private static JMenuItem graphicsJMenuItem;
    private static JMenuItem benchJMenuItem;
    public View() {
        setSize(500, 500);
        setTitle("CPU-Z");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainJPanel = new JPanel(new BorderLayout());

        cpuJPanel = new CPUJPanel();
        mainboardJPanel = new MainboardJPanel();
        memoryJPanel = new MemoryJPanel();
        graphicsJPanel = new GraphicsJPanel();
        benchJPanel = new BenchJPanel();

        cardLayout = new CardLayout();

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 1));
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.LIGHT_GRAY);
        menuPanel.add(menuBar);

        cpuJMenuItem = new JMenuItem("CPU");
        mainboardJMenuItem = new JMenuItem("Mainboard");
        memoryJMenuItem = new JMenuItem("Memory");
        graphicsJMenuItem = new JMenuItem("Graphics");
        benchJMenuItem = new JMenuItem("Bench");

        menuBar.add(cpuJMenuItem);
        menuBar.add(mainboardJMenuItem);
        menuBar.add(memoryJMenuItem);
        menuBar.add(graphicsJMenuItem);
        menuBar.add(benchJMenuItem);

        contentJPanel = new JPanel();
        contentJPanel.setLayout(cardLayout);

        contentJPanel.add(cpuJPanel, "0");
        contentJPanel.add(mainboardJPanel, "1");
        contentJPanel.add(memoryJPanel, "2");
        contentJPanel.add(graphicsJPanel, "3");
        contentJPanel.add(benchJPanel, "4");


        cardLayout.show(contentJPanel, "0");


        mainJPanel.add(menuPanel, BorderLayout.NORTH);
        mainJPanel.add(contentJPanel);
        setContentPane(mainJPanel);
    }
    public static void setCurrentJPanel(String id){
        cardLayout.show(contentJPanel, id);
    }
    public static void addJMenuListeners(){
        cpuJMenuItem.addActionListener(new Listeners.CPUJMenuListener());
        mainboardJMenuItem.addActionListener(new Listeners.MainboardJMenuListener());
        memoryJMenuItem.addActionListener(new Listeners.MemoryJMenuListener());
        graphicsJMenuItem.addActionListener(new Listeners.GraphicsJMenuListener());
        benchJMenuItem.addActionListener(new Listeners.BenchJMenuListener());
    }
}

