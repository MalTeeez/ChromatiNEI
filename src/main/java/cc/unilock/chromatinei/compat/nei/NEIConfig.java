package cc.unilock.chromatinei.compat.nei;

import Reika.ChromatiCraft.Registry.ChromaItems;
import cc.unilock.chromatinei.Tags;
import cc.unilock.chromatinei.compat.nei.handler.CastingTableHandler;
import cc.unilock.chromatinei.compat.nei.handler.PoolHandler;
import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

public class NEIConfig implements IConfigureNEI {
    private static final CastingTableHandler castingTable = new CastingTableHandler();
    private static final PoolHandler pool = new PoolHandler();

    @Override
    public void loadConfig() {
        API.registerRecipeHandler(castingTable);
        API.registerUsageHandler(castingTable);
        API.addRecipeCatalyst(ChromaItems.PLACER.getStackOfMetadata(5), castingTable);
        API.registerRecipeHandler(pool);
        API.registerUsageHandler(pool);
        API.addRecipeCatalyst(ChromaItems.BUCKET.getStackOf(), pool);
    }

    @Override
    public String getName() {
        return "ChromatiNEI";
    }

    @Override
    public String getVersion() {
        return Tags.VERSION;
    }
}
