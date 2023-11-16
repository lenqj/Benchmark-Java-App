package Controller;

import Model.Model;
import View.View;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners {
    public static class CPUJMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.setCurrentJPanel("0");
        }
    }

        public static class MainboardJMenuListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                View.setCurrentJPanel("1");
            }
        }

    public static class MemoryJMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.setCurrentJPanel("2");
        }
    }
    public static class GraphicsJMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.setCurrentJPanel("3");
        }
    }
    public static class BenchJMenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.setCurrentJPanel("4");
        }
    }
}
