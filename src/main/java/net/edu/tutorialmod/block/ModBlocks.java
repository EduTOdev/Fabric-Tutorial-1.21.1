package net.edu.tutorialmod.block;

import net.edu.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CryingObsidianBlock;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block CRYING_NETHERITE_BLOCK = registerBlock("crying_netherite_block",
            new CryingObsidianBlock(AbstractBlock.Settings.create()
                .strength(50f)
                .requiresTool()
                .sounds(BlockSoundGroup.NETHERITE)
                .luminance(state -> 10)
    ));

    public static final Block CRYING_NETHERITE_DEBRIS = registerBlock("crying_netherite_debris",
            new CryingObsidianBlock(AbstractBlock.Settings.create()
                .strength(50f)
                .requiresTool()
                .sounds(BlockSoundGroup.ANCIENT_DEBRIS)
                .luminance(state -> 10)
    ));

    public static final Block CRYING_NETHERITE_ORE = registerBlock("crying_netherite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),AbstractBlock.Settings.create()
                    .strength(50f)
                    .requiresTool()
                    .luminance(state -> 10)
            ));

    public static final Block CRYING_NETHERITE_DEEPSLATE_ORE = registerBlock("crying_netherite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),AbstractBlock.Settings.create()
                    .strength(50f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .luminance(state -> 10)
    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CRYING_NETHERITE_BLOCK);
            entries.add(ModBlocks.CRYING_NETHERITE_DEBRIS);
        });
    }

}
