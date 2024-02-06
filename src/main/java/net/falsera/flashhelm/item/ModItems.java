package net.falsera.flashhelm.item;


import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.falsera.flashhelm.FlashHelm;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class  ModItems {
    public static final Item FLASHLIGHT = registerItem("flashlight", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item TACHELM = registerItem("tachelm", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(FlashHelm.MOD_ID, name), item);
    }
    public static void registerModItems(){

    }
}
