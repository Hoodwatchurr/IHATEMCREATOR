package net.mcreator.cemtwo.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.cemtwo.init.CemtwoModParticleTypes;
import net.mcreator.cemtwo.CemtwoMod;

public class GoldenmossycobblestoneUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CemtwoMod.queueServerWork(20, () -> {
			world.addParticle((SimpleParticleType) (CemtwoModParticleTypes.HEAVENLY_PARTICLE.get()), x, y, z, 0, 1, 0);
		});
	}
}
