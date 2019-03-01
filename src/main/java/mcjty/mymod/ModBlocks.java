package mcjty.mymod;

import mcjty.mymod.furnace.BlockFastFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
    @GameRegistry.ObjectHolder("mymod:fast_furnace")
    public static BlockFastFurnace blockFastFurnace;
}
