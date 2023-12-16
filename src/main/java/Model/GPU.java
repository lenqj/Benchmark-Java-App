package Model;

import oshi.SystemInfo;
import oshi.hardware.GraphicsCard;
import oshi.hardware.HardwareAbstractionLayer;

import java.util.ArrayList;
import java.util.List;

public final class GPU {
    private static List<String> name;
    private static String boardManufacture;
    private static String driver;
    private static Long vRAM;
    public GPU(){
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        List<GraphicsCard> graphicsCard = hardware.getGraphicsCards();
        name = new ArrayList<>();
        for(GraphicsCard graphicCard: graphicsCard)
            name.add(graphicCard.getName());
        boardManufacture = graphicsCard.get(0).getVendor();
        driver = graphicsCard.get(0).getVersionInfo();
        vRAM = graphicsCard.get(0).getVRam();
    }
    public static List<String> getName() {
        return name;
    }

    public static String getBoardManufacture() {
        return boardManufacture;
    }

    public static String getDriver() {
        return driver;
    }

    public static Long getvRAM() {
        return vRAM;
    }
}