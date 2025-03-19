package net.pretzel.pretzelsfoods;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.pretzel.pretzelsfoods.datagen.ModLootTableProvider;
import net.pretzel.pretzelsfoods.datagen.ModModelsProvider;

public class PretzelsFoodsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelsProvider::new);
	}
}
