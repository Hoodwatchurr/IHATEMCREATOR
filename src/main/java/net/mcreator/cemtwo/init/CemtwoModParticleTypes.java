
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cemtwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.cemtwo.CemtwoMod;

public class CemtwoModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CemtwoMod.MODID);
	public static final RegistryObject<SimpleParticleType> HEAVENLY_PARTICLE = REGISTRY.register("heavenly_particle", () -> new SimpleParticleType(false));
}
