package net.fatcar.necrotuals.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class RitualCenterOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 2, y + 1, z + 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
			if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 2, y + 1, z - 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
				if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 2, y + 1, z + 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
					if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 2, y + 1, z - 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
						if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
							if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 1, y + 1, z + 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
								if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 1, y + 1, z - 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
									if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 1, y + 1, z - 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
										if (world instanceof ServerLevel _level) {
											LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
											entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
											_level.addFreshEntity(entityToSpawn);
										}
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are candles!"), false);
									} else {
										if (!world.isClientSide() && world.getServer() != null)
											world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
									}
								} else {
									if (!world.isClientSide() && world.getServer() != null)
										world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
								}
							} else {
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
							}
						} else {
							if (!world.isClientSide() && world.getServer() != null)
								world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
						}
					} else {
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
					}
				} else {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
				}
			} else {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
			}
		} else {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("There are no candles :("), false);
		}
	}
}
