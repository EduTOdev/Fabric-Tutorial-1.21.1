package net.edu.tutorialmod.item;

import net.edu.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CRYING_NETHERITE_INGOT = registerItem("crying_netherite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_CRYING_NETHERITE_INGOT = registerItem("raw_crying_netherite_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CRYING_NETHERITE_INGOT);
            entries.add(RAW_CRYING_NETHERITE_INGOT);
        });
    }
}
