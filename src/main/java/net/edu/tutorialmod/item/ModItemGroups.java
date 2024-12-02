package net.edu.tutorialmod.item;

import net.edu.tutorialmod.TutorialMod;
import net.edu.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CRYING_NETHERITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "crying_netherite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CRYING_NETHERITE_INGOT))
                    .displayName(Text.translatable("itemgroup.tutorialmod.crying_netherite_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CRYING_NETHERITE_INGOT);
                        entries.add(ModItems.RAW_CRYING_NETHERITE_INGOT);
                    }).build());

    public static final ItemGroup CRYING_NETHERITE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "crying_netherite_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CRYING_NETHERITE_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.crying_netherite_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CRYING_NETHERITE_BLOCK);
                        entries.add(ModBlocks.CRYING_NETHERITE_DEBRIS);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }

}
