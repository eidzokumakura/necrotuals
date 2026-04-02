
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

import net.fatcar.necrotuals.item.SunnyAmberItem;
import net.fatcar.necrotuals.item.DirtySoulItem;
import net.fatcar.necrotuals.item.ClearSoulItem;
import net.fatcar.necrotuals.NecrotualsMod;

public class NecrotualsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NecrotualsMod.MODID);
	public static final RegistryObject<Item> RITUAL_CENTER = block(NecrotualsModBlocks.RITUAL_CENTER);
	public static final RegistryObject<Item> CLEAR_SOUL = REGISTRY.register("clear_soul", () -> new ClearSoulItem());
	public static final RegistryObject<Item> DIRTY_SOUL = REGISTRY.register("dirty_soul", () -> new DirtySoulItem());
	public static final RegistryObject<Item> AMBER = block(NecrotualsModBlocks.AMBER);
	public static final RegistryObject<Item> SUNNY_AMBER = REGISTRY.register("sunny_amber", () -> new SunnyAmberItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
