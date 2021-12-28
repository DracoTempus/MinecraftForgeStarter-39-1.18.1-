package fonggrasin.mc.mods.core.blocks;

import fonggrasin.mc.mods.TestMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(Block.class, TestMod.MODID);
    public static RegistryObject<Block> TEST_BLOCK = register("first_block", ()->new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN).strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static <V extends Block> RegistryObject<V> register(String name, Supplier<V> sup) {
        RegistryObject<V> ans = BLOCK.register(name, sup);
        ItemRegistry.register(name, (p) -> new BlockItem(sup.get(), p));
        return ans;
    }
}
