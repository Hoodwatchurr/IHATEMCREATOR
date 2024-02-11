
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cemtwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cemtwo.block.NukeblockBlock;
import net.mcreator.cemtwo.block.GoldenmossycobblestoneBlock;
import net.mcreator.cemtwo.CemtwoMod;

public class CemtwoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CemtwoMod.MODID);
	public static final RegistryObject<Block> NUKEBLOCK = REGISTRY.register("nukeblock", () -> new NukeblockBlock());
	public static final RegistryObject<Block> GOLDENMOSSYCOBBLESTONE = REGISTRY.register("goldenmossycobblestone", () -> new GoldenmossycobblestoneBlock());
}
