package net.aarohan.mccourse.painting;

import net.aarohan.mccourse.MCCourseMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MCCourseMod.MOD_ID);

    public static final RegistryObject<PaintingVariant> PLANT =
            PAINTING_MOTIVES.register("mcplant", () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> WANDERER =
            PAINTING_MOTIVES.register("mcwanderer", () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> SUNSET =
            PAINTING_MOTIVES.register("mcsunset", () -> new PaintingVariant(32, 16));

    public static void register(IEventBus eventBus) {
        PAINTING_MOTIVES.register(eventBus);
    }
}
