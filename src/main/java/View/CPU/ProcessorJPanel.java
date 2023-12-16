package View.CPU;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ProcessorJPanel extends JPanel{
    private final JLabel nameJLabel;
    private final JLabel vendorJLabel;
    private final JLabel familyJLabel;
    private final JLabel processorIDJLabel;
    private final JLabel identifierJLabel;
    ProcessorJPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));
        panel.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, Color.GRAY), "Processor"));
        JLabel nameLabel = new JLabel("Name");
        JLabel vendorLabel = new JLabel("Vendor");
        JLabel familyLabel = new JLabel("Family");
        JLabel processorIDLabel = new JLabel("Processor ID");
        JLabel identifierLabel = new JLabel("Identifier");

        nameJLabel = new JLabel();
        vendorJLabel = new JLabel();
        familyJLabel = new JLabel();
        processorIDJLabel = new JLabel();
        identifierJLabel = new JLabel();

        panel.add(nameLabel);
        panel.add(nameJLabel);
        panel.add(vendorLabel);
        panel.add(vendorJLabel);
        panel.add(familyLabel);
        panel.add(familyJLabel);
        panel.add(processorIDLabel);
        panel.add(processorIDJLabel);
        panel.add(identifierLabel);
        panel.add(identifierJLabel);


        add(panel);
    }
    void setNameJLabel(String textArea){
        nameJLabel.setText(textArea);
    }
    void setVendorJLabel(String textArea){
        vendorJLabel.setText(textArea);
    }
    void setFamilyJLabel(String textArea){
        familyJLabel.setText(textArea);
    }
    void setProcessorIDJLabel(String textArea){
        processorIDJLabel.setText(textArea);
    }
    void setIdentifierJLabel(String textArea){
        identifierJLabel.setText(textArea);
    }

}

