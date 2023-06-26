package io.github.busituteng.wmsm.procedure;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.github.busituteng.wmsm.ElementsWmsmMod;

@ElementsWmsmMod.ModElement.Tag
public class ProcedurePrawnheadmanPotionExpires extends ElementsWmsmMod.ModElement {
	public ProcedurePrawnheadmanPotionExpires(ElementsWmsmMod instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PrawnheadmanPotionExpires!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.MAGIC, (float) 25);
	}
}
