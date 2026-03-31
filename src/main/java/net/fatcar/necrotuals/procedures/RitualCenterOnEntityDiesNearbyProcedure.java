package net.fatcar.necrotuals.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.fatcar.necrotuals.init.NecrotualsModBlocks;

public class RitualCenterOnEntityDiesNearbyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double radius = 0;
		double radx = 0;
		double rady = 0;
		double radz = 0;
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u0421\u0414\u041E\u0425\u0414\u041B\u041E"), false);
		radius = 3;
		radx = -3;
		rady = -3;
		radz = -3;
		for (int index0 = 0; index0 < 7; index0++) {
			for (int index1 = 0; index1 < 7; index1++) {
				for (int index2 = 0; index2 < 7; index2++) {
					if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(radx + entity.getX(), rady + entity.getY(), radz + entity.getZ()))).getBlock()).toString())
							.equals(ForgeRegistries.BLOCKS.getKey(NecrotualsModBlocks.RITUAL_CENTER.get()).toString())) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.SUGAR_CANE));
							entityToSpawn.setPickUpDelay(1);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u0423\u0411\u0418\u041B\u0414\u0418 \u0418 \u0421\u0425\u0415\u041B\u0418"), false);
					}
					radz = radz + 1;
				}
				radx = radx + 1;
			}
			rady = rady + 1;
		}
	}
}
