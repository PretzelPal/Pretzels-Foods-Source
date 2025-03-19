package net.pretzel.pretzelsfoods.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pretzel.pretzelsfoods.PretzelsFoods;
import net.pretzel.pretzelsfoods.block.ModBlocks;

public class ModItems {
    public static final Item RAWPRETZEL = registerItem("raw-pretzel", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_PRETZEL)));
    public static final Item RAWSAUSAGE = registerItem("raw-sausage", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_SAUSAGE)));
    public static final Item RAWHOTDOG = registerItem("raw-hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_HOTDOG)));
    public static final Item COOKEDPRETZEL = registerItem("cooked-pretzel", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_PRETZEL)));
    public static final Item COOKEDSAUSAGE = registerItem("cooked-sausage", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SAUSAGE)));
    public static final Item COOKEDHOTDOG = registerItem("cooked-hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_HOTDOG)));
    public static final Item HOTDOGBUN = registerItem("hotdog-bun", new Item(new FabricItemSettings()));
    public static final Item SALTEDPRETZEL = registerItem("salted-pretzel", new Item(new FabricItemSettings().food(ModFoodComponents.SALTED_PRETZEL)));
    public static final Item DOUGH = registerItem("dough", new Item(new FabricItemSettings()));
    public static final Item SALT = registerItem("salt", new Item(new FabricItemSettings()));
    public static final Item EMPTYJAR = registerItem("empty-jar", new Item(new FabricItemSettings()));
    public static final Item KETCHUPJAR = registerItem("ketchup-jar", new Item(new FabricItemSettings()));
    public static final Item MUSTARDJAR = registerItem("mustard-jar", new Item(new FabricItemSettings()));
    public static final Item MUSTARDHOTDOG = registerItem("mustard-hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.MUSTARD_HOTDOG)));
    public static final Item KETCHUPHOTDOG = registerItem("ketchup-hotdog", new Item(new FabricItemSettings().food(ModFoodComponents.KETCHUP_HOTDOG)));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    private static void addItemstoFoodGroup(FabricItemGroupEntries entries) {
        entries.add(RAWPRETZEL);
        entries.add(RAWSAUSAGE);
        entries.add(COOKEDPRETZEL);
        entries.add(COOKEDSAUSAGE);
        entries.add(SALTEDPRETZEL);
        entries.add(RAWHOTDOG);
        entries.add(COOKEDHOTDOG);
        entries.add(KETCHUPHOTDOG);
        entries.add(MUSTARDHOTDOG);
    }

    private static void addItemstoIngredientsGroup(FabricItemGroupEntries entries) {
        entries.add(DOUGH);
        entries.add(HOTDOGBUN);
        entries.add(SALT);
        entries.add(EMPTYJAR);
        entries.add(KETCHUPJAR);
        entries.add(MUSTARDJAR);
    }

    private static void addItemstoNaturalGroup(FabricItemGroupEntries entries) {
        entries.add(TOMATO);
        entries.add(TOMATO_SEEDS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PretzelsFoods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PretzelsFoods.LOGGER.info("Registering Mod Items for " + PretzelsFoods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemstoFoodGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemstoIngredientsGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemstoNaturalGroup);
    }
}
