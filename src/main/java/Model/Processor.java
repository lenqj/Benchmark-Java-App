package Model;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;


public final class Processor {
    private static String vendor;
    private static String name;
    private static String family;
    private static String model;
    private static String stepping;
    private static String processorID;
    private static String identifier;
    public Processor(){
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        CentralProcessor.ProcessorIdentifier processorIdentifier = processor.getProcessorIdentifier();
        vendor = processorIdentifier.getVendor();
        name = processorIdentifier.getName();
        family = processorIdentifier.getFamily();
        model = processorIdentifier.getModel();
        stepping = processorIdentifier.getStepping();
        processorID = processorIdentifier.getProcessorID();
        identifier = processorIdentifier.getIdentifier();
    }
    @Override
    public String toString() {
        return String.format(
                """
                        Processor Information:
                           Vendor: %s
                           Name: %s
                           Family: %s
                           Model: %s
                           Stepping: %s
                           Processor ID: %s
                           Identifier: %s""",
                vendor, name, family, model, stepping, processorID, identifier
        );
    }
    public static String getVendor() {
        return vendor;
    }

    public static String getName() {
        return name;
    }

    public static String getFamily() {
        return family;
    }

    public static String getModel() {
        return model;
    }

    public static String getStepping() {
        return stepping;
    }

    public static String getProcessorID() {
        return processorID;
    }

    public static String getIdentifier() {
        return identifier;
    }
}
