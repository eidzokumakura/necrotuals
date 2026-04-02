
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fatcar.necrotuals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.fatcar.necrotuals.block.RitualCenterBlock;
import net.fatcar.necrotuals.block.AmberBlock;
import net.fatcar.necrotuals.NecrotualsMod;

public class NecrotualsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NecrotualsMod.MODID);
	public static final RegistryObject<Block> RITUAL_CENTER = REGISTRY.register("ritual_center", () -> new RitualCenterBlock());
	public static final RegistryObject<Block> AMBER = REGISTRY.register("amber", () -> new AmberBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
