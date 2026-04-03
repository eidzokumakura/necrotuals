
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fatcar.necrotuals.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.fatcar.necrotuals.client.model.Modelstub;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NecrotualsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelstub.LAYER_LOCATION, Modelstub::createBodyLayer);
	}
}
