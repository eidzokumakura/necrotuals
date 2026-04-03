
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fatcar.necrotuals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.fatcar.necrotuals.NecrotualsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NecrotualsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NecrotualsMod.MODID);
	public static final RegistryObject<CreativeModeTab> NECROTUALS = REGISTRY.register("necrotuals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.necrotuals.necrotuals")).icon(() -> new ItemStack(NecrotualsModItems.CLEAR_SOUL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NecrotualsModBlocks.AMBER.get().asItem());
				tabData.accept(NecrotualsModItems.SUNNY_AMBER.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NecrotualsModBlocks.RITUAL_CENTER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NecrotualsModItems.CLEAR_SOUL.get());
			tabData.accept(NecrotualsModItems.DIRTY_SOUL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NecrotualsModItems.STUB_SPAWN_EGG.get());
		}
	}
}
