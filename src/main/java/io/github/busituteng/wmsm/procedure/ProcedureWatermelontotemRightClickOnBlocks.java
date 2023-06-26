package io.github.busituteng.wmsm.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.github.busituteng.wmsm.entity.EntityWatermelonstrip;
import io.github.busituteng.wmsm.ElementsWmsmMod;

@ElementsWmsmMod.ModElement.Tag
public class ProcedureWatermelontotemRightClickOnBlocks extends ElementsWmsmMod.ModElement {
	public ProcedureWatermelontotemRightClickOnBlocks(ElementsWmsmMod instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure WatermelontotemRightClickOnBlocks!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure WatermelontotemRightClickOnBlocks!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure WatermelontotemRightClickOnBlocks!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure WatermelontotemRightClickOnBlocks!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			Entity entityToSpawn = new EntityWatermelonstrip.EntityCustom(world);
			if (entityToSpawn != null) {
				entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.rand.nextFloat() * 360F, 0.0F);
				world.spawnEntity(entityToSpawn);
			}
		}
	}
}
