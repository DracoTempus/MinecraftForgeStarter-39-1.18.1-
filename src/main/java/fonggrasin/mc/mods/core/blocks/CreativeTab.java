package fonggrasin.mc.mods.core.blocks;

import fonggrasin.mc.mods.TestMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab extends CreativeModeTab {

    public static final CreativeTab INSTANCE = new CreativeTab();

    public CreativeTab() {
        super(TestMod.MODID);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.TEST_ITEM.get());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
