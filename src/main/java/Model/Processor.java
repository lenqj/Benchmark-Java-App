package Model;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

import java.util.List;


public final class Processor {
    private static String vendor;
    private static String name;
    private static String family;
    private static String model;
    private static String stepping;
    private static String processorID;
    private static String identifier;
    private static String cacheL1;
    private static String cacheL2;
    private static String cacheL3;
    private static Long frequency;
    public Processor(){
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();
        CentralProcessor.ProcessorIdentifier processorIdentifier = processor.getProcessorIdentifier();
        List<CentralProcessor.ProcessorCache> processorCaches = processor.getProcessorCaches();

        vendor = processorIdentifier.getVendor();
        name = processorIdentifier.getName();
        family = processorIdentifier.getFamily();
        model = processorIdentifier.getModel();
        stepping = processorIdentifier.getStepping();
        processorID = processorIdentifier.getProcessorID();
        identifier = processorIdentifier.getIdentifier();

        cacheL3 = processorCaches.get(0).getCacheSize() + "B " + processorCaches.get(0).getAssociativity() + " way";
        cacheL2 = processorCaches.get(1).getCacheSize() + "B " + processorCaches.get(1).getAssociativity() + " way";
        cacheL1 = processorCaches.get(2).getCacheSize() + "B " + processorCaches.get(2).getAssociativity() + " way";

        frequency = processor.getMaxFreq()/1000000;
    };
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

    public static String getCacheL1() {
        return cacheL1;
    }

    public static String getCacheL2() {
        return cacheL2;
    }

    public static String getCacheL3() {
        return cacheL3;
    }

    public static Long getFrequency() {
        return frequency;
    }
}
