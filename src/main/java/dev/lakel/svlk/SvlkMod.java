package dev.lakel.svlk;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SvlkMod implements ModInitializer {
  public static final String MOD_ID = "svlk";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  // L'objet utilise maintenant l'import de Mojang
  public static final Item SVLK_TOKEN = new Item(new FabricItemSettings());

  @Override
  public void onInitialize() {
    LOGGER.info("Démarrage du chargement du mod SVLK...");

    // Identifier devient ResourceLocation, et Registries devient BuiltInRegistries
    Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, "svlk_token"), SVLK_TOKEN);
  }
}
