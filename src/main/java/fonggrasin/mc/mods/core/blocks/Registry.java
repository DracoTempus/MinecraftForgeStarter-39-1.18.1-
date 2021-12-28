package fonggrasin.mc.mods.core.blocks;

import fonggrasin.mc.mods.TestMod;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {
    public static final Registry INSTANCE = new Registry();

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TestMod.MODID);
    public static final DeferredRegister<MenuType<?>> MENU = DeferredRegister.create(ForgeRegistries.CONTAINERS, TestMod.MODID);

    public void registerEvents() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.register(INSTANCE);
        BlockRegistry.BLOCK.register(modBus);
        ItemRegistry.ITEM.register(modBus);
        RECIPE.register(modBus);
        MENU.register(modBus);
    }
}
