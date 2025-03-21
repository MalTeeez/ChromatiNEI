package cc.unilock.chromatinei.compat;

import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.nbt.NBTTagCompound;

public class IMCHandler {
    public static void init() {
        sendHandler("cc.unilock.chromatinei.compat.nei.handler.CastingTableHandler", "ChromatiCraft:chromaticraft_item_placer:5", 226, 149);
        sendCatalyst("cc.unilock.chromatinei.compat.nei.handler.CastingTableHandler", "ChromatiCraft:chromaticraft_item_placer:5");
        sendHandler("cc.unilock.chromatinei.compat.nei.handler.PoolHandler", "ChromatiCraft:chromaticraft_item_bucket", 150, 130);
        sendCatalyst("cc.unilock.chromatinei.compat.nei.handler.PoolHandler", "ChromatiCraft:chromaticraft_item_bucket");
    }

    private static void sendHandler(String handler, String workstation, int height, int width) {
        NBTTagCompound nbt = new NBTTagCompound();
        nbt.setString("handler", handler);
        nbt.setString("modName", "ChromatiNEI");
        nbt.setString("modId", "ChromatiCraft");
        nbt.setBoolean("modRequired", true);
        nbt.setString("itemName", workstation);
        nbt.setInteger("handlerHeight", height);
        nbt.setInteger("handlerWidth", width);
        nbt.setInteger("maxRecipesPerPage", 1);
        FMLInterModComms.sendMessage("NotEnoughItems", "registerHandlerInfo", nbt);
    }

    private static void sendCatalyst(String handler, String workstation) {
        NBTTagCompound aNBT = new NBTTagCompound();
        aNBT.setString("handlerID", handler);
        aNBT.setString("itemName", workstation);
        FMLInterModComms.sendMessage("NotEnoughItems", "registerCatalystInfo", aNBT);
    }
}
