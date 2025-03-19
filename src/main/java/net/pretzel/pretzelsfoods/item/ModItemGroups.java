package net.pretzel.pretzelsfoods.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pretzel.pretzelsfoods.PretzelsFoods;

public class ModItemGroups {
    public static final ItemGroup PRETZELS_FOODS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PretzelsFoods.MOD_ID, "pretzel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pretzel"))
                    .icon(() -> new ItemStack(ModItems.SALTEDPRETZEL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAWPRETZEL);
                        entries.add(ModItems.COOKEDPRETZEL);
                        entries.add(ModItems.SALTEDPRETZEL);
                        entries.add(ModItems.DOUGH);
                        entries.add(ModItems.EMPTYJAR);
                        entries.add(ModItems.KETCHUPJAR);
                        entries.add(ModItems.MUSTARDJAR);
                        entries.add(ModItems.MUSTARDHOTDOG);
                        entries.add(ModItems.KETCHUPHOTDOG);
                        entries.add(ModItems.RAWHOTDOG);
                        entries.add(ModItems.RAWSAUSAGE);
                        entries.add(ModItems.COOKEDHOTDOG);
                        entries.add(ModItems.COOKEDSAUSAGE);
                        entries.add(ModItems.HOTDOGBUN);
                        entries.add(ModItems.SALT);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.TOMATO_SEEDS);


                    }).build());

    public static void registerItemGroups() {
        PretzelsFoods.LOGGER.info("Registering item groups for Pretzels Foods, now be quiet.");

    }
}
