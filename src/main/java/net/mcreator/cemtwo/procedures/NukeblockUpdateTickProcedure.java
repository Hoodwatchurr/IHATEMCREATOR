package net.mcreator.cemtwo.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NukeblockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.BLOCK);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
