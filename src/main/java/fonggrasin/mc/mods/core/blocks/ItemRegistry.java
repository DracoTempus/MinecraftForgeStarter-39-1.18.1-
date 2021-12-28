package fonggrasin.mc.mods.core.blocks;

import fonggrasin.mc.mods.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(Item.class, TestMod.MODID);

    public static RegistryObject<Item> TEST_ITEM = register("first_item", GenericItem::new);

    public static <V extends Item> RegistryObject<V> register(String name, Function<Item.Properties, V> sup) {
        return ITEM.register(name, () -> sup.apply(new Item.Properties().tab(CreativeTab.INSTANCE)));
    }
}
