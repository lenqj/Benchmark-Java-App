package Controller;
import Model.*;
import View.View;

public class Controller {
    View view;
    Model model;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        setProcessorTextFields();
        View.addJMenuListeners();
        setVisible(true);
    }
    public void setProcessorTextFields(){
        View.setNameTextArea(Processor.getName());
        View.setVendorTextArea(Processor.getVendor());
        View.setFamilyTextArea(Processor.getFamily());
        View.setProcessorIDTextArea(Processor.getProcessorID());
        View.setIdentifierTextArea(Processor.getIdentifier());
    }
    public void setVisible(boolean flag){
        view.setVisible(flag);
    }
}
