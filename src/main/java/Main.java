import Controller.Controller;
import View.*;
import Model.*;
import oshi.*;
import oshi.hardware.*;
import oshi.util.FormatUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
        controller.setVisible(true);
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();

        System.out.println(processor.toString());

        CentralProcessor.ProcessorIdentifier processorIdentifier = processor.getProcessorIdentifier();

        System.out.println("Processor Vendor: " + processorIdentifier.getVendor());
        System.out.println("Processor Name: " + processorIdentifier.getName());
        System.out.println("Processor ID: " + processorIdentifier.getProcessorID());
        System.out.println("Identifier: " + processorIdentifier.getIdentifier());
        System.out.println("Microarchitecture: " + processorIdentifier.getMicroarchitecture());
        System.out.println("Frequency (Hz): " + processorIdentifier.getVendorFreq());
        System.out.println("Frequency (GHz): " + processorIdentifier.getVendorFreq() / 1000000000.0);

        GlobalMemory globalMemory = hardware.getMemory();

        long usedMemory = globalMemory.getTotal() - globalMemory.getAvailable();

        System.out.println("Total memory: " + FormatUtil.formatBytes(globalMemory.getTotal()));
        System.out.println("Available memory: " + FormatUtil.formatBytes(globalMemory.getAvailable()));
        System.out.println("Used memory: " + FormatUtil.formatBytes(usedMemory));
        List<PhysicalMemory> physicalMemories = globalMemory.getPhysicalMemory();
        for (PhysicalMemory physicalMemory : physicalMemories) {
            System.out.println(physicalMemory.toString());
        }

    }
}