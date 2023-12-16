package Model;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;


public final class RAM {
    private static Long frequency;
    private static Long size;
    private static String type;
    private static String manufacturer;
    private static String bank;
    RAM(){
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        GlobalMemory ramMemory = hardware.getMemory();
        size = ramMemory.getTotal()/1000000000;
        frequency = ramMemory.getPhysicalMemory().get(0).getClockSpeed()/1000000;;
        type = String.valueOf(ramMemory.getPhysicalMemory().get(0).getMemoryType());
        manufacturer = ramMemory.getPhysicalMemory().get(0).getManufacturer();
        bank = ramMemory.getPhysicalMemory().get(0).getBankLabel();
    }

    public static Long getFrequency() {
        return frequency;
    }
    public static Long getSize() {
        return size;
    }
    public static String getType() {
        return type;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static String getBank() {
        return bank;
    }
}
