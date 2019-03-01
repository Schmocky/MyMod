package mcjty.mymod.furnace;

import mcjty.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockFastFurnace extends Block {

    public static final ResourceLocation FAST_FURNACE = new ResourceLocation(MyMod.MODID, "fast_furnace");

    public BlockFastFurnace() {
        super(Material.IRON);
        // mymod:furnace
        setRegistryName(FAST_FURNACE);
        setTranslationKey(MyMod.MODID + ".fast_furnace");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(MyMod.creativeTab);
    }
}

