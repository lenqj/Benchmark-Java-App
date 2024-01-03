package Controller;
import Model.*;
import View.View;

public class Controller {
    View view;
    Model model;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        setProcessorLabels();
        setGPULabels();
        setRAMLabels();
        View.addJMenuListeners();
        View.addButtonsListeners();
        setVisible(true);
    }

    public void setProcessorLabels(){
        setProcessorJLabels();
        setProcessorCacheJLabels();
        setProcessorFrequencyJLabel();
    }
    public void setProcessorJLabels(){
        View.setNameJLabel(Processor.getName());
        View.setVendorJLabel(Processor.getVendor());
        View.setFamilyJLabel(Processor.getFamily());
        View.setProcessorIDJLabel(Processor.getProcessorID());
        View.setIdentifierJLabel(Processor.getIdentifier());
    }
    public void setProcessorCacheJLabels(){
        View.setCacheL1Label(String.valueOf(Processor.getCacheL1()));
        View.setCacheL2Label(String.valueOf(Processor.getCacheL2()));
        View.setCacheL3Label(String.valueOf(Processor.getCacheL3()));
    }
    public void setProcessorFrequencyJLabel(){
        View.setProcessorFrequencyJLabel(Processor.getFrequency() + "MHz");
    }

    public void setGPULabels(){
        setGPUnameList();
        setGPUGPULabels();
    }
    public void setGPUnameList(){
        View.setGPUNameList(GPU.getName());
    }
    public void setGPUGPULabels(){
        View.setGPUNameJLabel(String.valueOf(GPU.getName()));
        View.setBoardManufactureJLabel(GPU.getBoardManufacture());
        View.setDriverJLabel(GPU.getDriver());
        View.setVRAMJLabel(String.valueOf(GPU.getvRAM()));
    }

    public void setRAMLabels(){
        setRAMGeneralLabels();
        setRAMTimingsLabels();
    }

    public void setRAMGeneralLabels(){
            View.setRAMSizeJLabel(RAM.getSize() + " GB");
            View.setRAMTypeJLabel(RAM.getType());
    }
    public void setRAMTimingsLabels(){
        View.setRAMBankJLabel(RAM.getBank());
        View.setRAMManufacturerJLabel(RAM.getManufacturer());
        View.setRAMFrequencyJLabel(RAM.getFrequency() + " MHz");
    }

    public void setVisible(boolean flag){
        view.setVisible(flag);
    }
}
