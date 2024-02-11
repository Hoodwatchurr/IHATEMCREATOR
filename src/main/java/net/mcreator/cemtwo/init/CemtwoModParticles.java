
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cemtwo.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cemtwo.client.particle.HeavenlyParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CemtwoModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CemtwoModParticleTypes.HEAVENLY_PARTICLE.get(), HeavenlyParticleParticle::provider);
	}
}
