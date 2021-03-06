package mcjty.mymod;

import mcjty.mymod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MyMod.MODID, name = MyMod.MODNAME, version = MyMod.MODVERSION, dependencies = "required-after:forge@[14.23.5.2775,)", useMetadata = true)
public class MyMod {

    public static final String MODID = "mymod";
    public static final String MODNAME = "My Mod";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "mcjty.mymod.proxy.ClientProxy", serverSide = "mcjty.mymod.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs("My Mod"){
        @Override
        public ItemStack createIcon() {return new ItemStack(ModBlocks.blockFastFurnace); }
    };

    @Mod.Instance
    public static MyMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}