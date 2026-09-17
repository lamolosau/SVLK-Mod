package dev.lakel.svlk;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class SvlkMod implements ModInitializer {
  public static final String MOD_ID = "svlk";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
  
  public static final Item SVLKIUM_INGOT = Registry.register(
    BuiltInRegistries.ITEM,
    new ResourceLocation("svlk", "svlkium_ingot"),
    new Item(new FabricItemSettings())
  );

  // --- MINERAI DE SVLKIUM ---
public static final Block SVLKIUM_ORE = Registry.register(
    BuiltInRegistries.BLOCK,
    new ResourceLocation("svlk", "svlkium_ore"),
    new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresCorrectToolForDrops().strength(3.0f, 3.0f))
);
public static final Item SVLKIUM_ORE_ITEM = Registry.register(
    BuiltInRegistries.ITEM,
    new ResourceLocation("svlk", "svlkium_ore"),
    new BlockItem(SVLKIUM_ORE, new FabricItemSettings())
);

// --- BLOC DE SVLKIUM ---
public static final Block SVLKIUM_BLOCK = Registry.register(
    BuiltInRegistries.BLOCK,
    new ResourceLocation("svlk", "svlkium_block"),
    new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0f, 6.0f))
);
public static final Item SVLKIUM_BLOCK_ITEM = Registry.register(
    BuiltInRegistries.ITEM,
    new ResourceLocation("svlk", "svlkium_block"),
    new BlockItem(SVLKIUM_BLOCK, new FabricItemSettings())
);

  @Override
  public void onInitialize() {
    LOGGER.info("Démarrage du chargement du mod SVLK...");

  }
}
