package net.fatcar.necrotuals.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class RitualCenterOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean isAltarWrong = false;
		isAltarWrong = false;
		if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 2, y, z + 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
			if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 2, y, z - 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
				if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 2, y, z + 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
					if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 2, y, z - 1))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
						if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 1, y, z + 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
							if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 1, y, z + 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
								if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + 1, y, z - 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
									if ((ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x - 1, y, z - 2))).getBlock()).toString()).equals(ForgeRegistries.BLOCKS.getKey(Blocks.CANDLE).toString())) {
										if (world instanceof ServerLevel _level) {
											LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
											entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
											entityToSpawn.setVisualOnly(true);
											_level.addFreshEntity(entityToSpawn);
										}
										isAltarWrong = true;
									}
								}
							}
						}
					}
				}
			}
		}
		if (!isAltarWrong) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x + 2.5), y, (z + 1.5), 50, 0, 2, 0, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x + 2.5), y, (z - 0.5), 50, 0, 2, 0, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x - 1.5), y, (z + 1.5), 50, 0, 2, 0, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x - 1.5), y, (z - 0.5), 50, 0, 2, 0, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x + 1.5), y, (z + 2.5), 50, 0, 2, 0, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x + 1.5), y, (z - 1.5), 50, 0, 2, 0, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x - 0.5), y, (z + 2.5), 50, 0, 2, 0, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x - 0.5), y, (z - 1.5), 50, 0, 2, 0, 0.1);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.ON_FIRE)), 1);
		}
	}
}
