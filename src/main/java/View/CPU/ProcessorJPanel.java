package View.CPU;

import javax.swing.*;

public class ProcessorJPanel extends JPanel{
    private final JTextArea nameTextArea;
    private final JTextArea vendorTextArea;
    private final JTextArea familyTextArea;
    private final JTextArea processorIDTextArea;
    private final JTextArea identifierTextArea;
    ProcessorJPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel nameLabel = new JLabel("Name");
        JLabel vendorLabel = new JLabel("Vendor");
        JLabel familyLabel = new JLabel("Family");
        JLabel processorIDLabel = new JLabel("Processor ID");
        JLabel identifierLabel = new JLabel("Identifier");

        nameTextArea = new JTextArea();
        vendorTextArea = new JTextArea();
        familyTextArea = new JTextArea();
        processorIDTextArea = new JTextArea();
        identifierTextArea = new JTextArea();
        setTextAreasEditable();

        panel.add(nameLabel);
        panel.add(nameTextArea);
        panel.add(vendorLabel);
        panel.add(vendorTextArea);
        panel.add(familyLabel);
        panel.add(familyTextArea);
        panel.add(processorIDLabel);
        panel.add(processorIDTextArea);
        panel.add(identifierLabel);
        panel.add(identifierTextArea);


        add(panel);
    }
    void setNameTextArea(String textArea){
        nameTextArea.setText(textArea);
    }
    void setVendorTextArea(String textArea){
        vendorTextArea.setText(textArea);
    }

    void setFamilyTextArea(String textArea){
        familyTextArea.setText(textArea);
    }
    void setProcessorIDTextArea(String textArea){
        processorIDTextArea.setText(textArea);
    }

    void setIdentifierTextArea(String textArea){
        identifierTextArea.setText(textArea);
    }

    private void setTextAreasEditable(){
        nameTextArea.setEditable(false);
        vendorTextArea.setEditable(false);
        familyTextArea.setEditable(false);
        processorIDTextArea.setEditable(false);
        identifierTextArea.setEditable(false);
    }

}

