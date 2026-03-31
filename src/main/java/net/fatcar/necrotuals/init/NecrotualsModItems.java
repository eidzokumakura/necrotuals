
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fatcar.necrotuals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.fatcar.necrotuals.NecrotualsMod;

public class NecrotualsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NecrotualsMod.MODID);
	public static final RegistryObject<Item> RITUAL_CENTER = block(NecrotualsModBlocks.RITUAL_CENTER);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
